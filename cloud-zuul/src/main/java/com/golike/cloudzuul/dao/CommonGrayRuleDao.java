package com.golike.cloudzuul.dao;

import com.golike.cloudzuul.entity.CommonGrayRule;

/**
 * @author zhenpengmu
 */
public interface CommonGrayRuleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonGrayRule record);

    int insertSelective(CommonGrayRule record);

    CommonGrayRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonGrayRule record);

    int updateByPrimaryKey(CommonGrayRule record);
}