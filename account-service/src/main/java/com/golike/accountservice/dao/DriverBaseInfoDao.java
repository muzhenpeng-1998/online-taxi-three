package com.golike.accountservice.dao;

import com.golike.accountservice.mapper.DriverBaseInfoMapper;
import com.golike.internalservice.entity.DriverBaseInfo;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


/**
 *  司机信息
 * @date 2018/08/10
 **/
@Repository
@RequiredArgsConstructor
public class DriverBaseInfoDao {

    @NonNull
    private DriverBaseInfoMapper driverBaseInfoMapper;

    public int deleteByPrimaryKey(Integer id) {
        return driverBaseInfoMapper.deleteByPrimaryKey(id);
    }


    public int insert(DriverBaseInfo record) {
        return driverBaseInfoMapper.insert(record);
    }


    public int insertSelective(DriverBaseInfo record) {
        return driverBaseInfoMapper.insertSelective(record);
    }


    public DriverBaseInfo selectByPrimaryKey(Integer id) {
        return driverBaseInfoMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(DriverBaseInfo record) {
        return driverBaseInfoMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(DriverBaseInfo record) {
        return driverBaseInfoMapper.updateByPrimaryKey(record);
    }
}