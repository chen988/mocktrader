package com.kuang.service;
import com.kuang.mapper.UserMapper;
import com.kuang.pojo.Asset;

import com.kuang.pojo.User;
import io.grpc.user.mocktrader.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Trader {
    public static void main(String[] args) {
    }

    public BuyRes buy(BuyReq req) {
        long uid = req.getUid();
        long num = req.getNum();
        int type = req.getType();
        String code = req.getCode();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        long balance = userMapper.selectUserBalance(uid);
        System.out.println(balance);
        //price = selectPriceByCode(assetcode);
        long price = 1;
        long needMoney = price*num;
        if(needMoney <= balance) {
            balance -= needMoney;
            System.out.println(balance);
            userMapper.updateUserBalance(uid,balance);

            Asset asset1 = userMapper.selectAsset(uid, type);
            long num1 = 0;
            if(asset1 != null) {
                num1 = asset1.getNum();
            }
            System.out.println(num1);
            if(asset1 == null) {
                userMapper.insertAsset(uid, type,code,num);
            } else {
                num += num1;
                System.out.println(num);
                userMapper.updateAsset(uid,type,code,num);
            }
        } else {
            num = 0;
            needMoney = 0;
        }
        BuyRes res = BuyRes.newBuilder().setNum(num).setTotal(needMoney).build();
        return res;
    }

    public SellRes sell (SellReq req){
        long uid = req.getUid();
        int type = req.getType();
        long num = req.getNum();
        String code = req.getCode();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        long curnum = userMapper.selectAssetNum(uid, type,code);
        if(curnum < num) {
            SellRes res = SellRes.newBuilder().build();
            return res;
        } else {
            userMapper.updateAsset(uid,type,code,curnum-num);
            long price = 10;
            long balance = userMapper.selectUserBalance(uid);
            System.out.println(balance);
            userMapper.updateUserBalance(uid,balance+price*num);
            long balance1 = userMapper.selectUserBalance(uid);
            System.out.println(balance1);
            return SellRes.newBuilder().setTotal(price * num).setNum(num).build();
        }
    }



    public QueryRes query(QueryReq req) {
        long uid = req.getUid();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<Asset> assetData = userMapper.selectAssetData(uid);
        List<AssetData> list = new ArrayList<AssetData>();
        if(assetData != null) {
            for(Asset asset : assetData) {
                AssetData.Builder assetBuilder = AssetData.newBuilder();
                assetBuilder.setType(asset.getType()).setNum(asset.getNum()).setCode(asset.getCode());
                list.add(assetBuilder.build());
                System.out.println(assetData);
            }
        }

        User user = userMapper.selectUser(uid);
        if(user != null) {
            AssetData.Builder moneyAssetBuilder = AssetData.newBuilder();
            moneyAssetBuilder.setCode("").setType(-1).setNum(user.getBalance());
            list.add(moneyAssetBuilder.build());
        }
        return QueryRes.newBuilder().addAllAssets(list).build();
    }




}

