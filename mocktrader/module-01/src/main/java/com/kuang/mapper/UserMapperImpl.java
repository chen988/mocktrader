package com.kuang.mapper;

import com.kuang.pojo.Asset;
import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/*
* 由于原先sqlSession整合spring后变为面向对象的，因此需要一个实现类*/
public class UserMapperImpl implements UserMapper{


    //可将SqlSessionTemplate视为原来的sqlSession
    private SqlSessionTemplate sqlSession;


    //使用set方法将sqlSession注入
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User selectUser(long uid) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser(uid);//此处使用selectUser()方法
    }

    @Override
    public int selectUserBalance(long uid) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUserBalance(uid);
    }

    @Override
    public Integer updateUserBalance(long uid,long balance) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.updateUserBalance(uid,balance);
    }

    @Override
    public Asset selectAsset(long uid, int type) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAsset(uid,type);
    }



    @Override
    public int insertAsset(long uid,int type,String code,long num) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.insertAsset(uid, type,code,num);
    }

    @Override
    public Integer updateAsset(long uid,int type,String code,long num) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return mapper.updateAsset(uid, type,code,num);
    }

    @Override
    public int selectAssetNum(long uid, int type,String code) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAssetNum(uid,type,code);

    }

    @Override
    public List<Asset> selectAssetData(long uid) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAssetData(uid);
    }


}
