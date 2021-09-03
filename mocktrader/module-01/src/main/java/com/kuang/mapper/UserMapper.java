package com.kuang.mapper;
import com.kuang.pojo.Asset;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {

    public User selectUser(long uid);

    public int selectUserBalance(long uid);

    public Integer updateUserBalance(long uid,long balance);

    public Asset selectAsset(long uid,int type);

    public int insertAsset(long uid,int type,String code,long num);

    public Integer updateAsset(long uid,int type,String code,long num);

    public int selectAssetNum(long uid,int type,String code);

    public List<Asset> selectAssetData(long uid);

    //public List<AssetData> selectUserData(long uid);


}
