package com.golike.accountservice.mapper;

import org.springframework.stereotype.Service;

import com.golike.internalservice.entity.PassengerAddress;

import java.util.List;

/**
 * @date  2018/09/05
 */
@Service
public interface PassengerAddressMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PassengerAddress record);

    int insertSelective(PassengerAddress record);

    PassengerAddress selectByPrimaryKey(Integer id);

    PassengerAddress selectByPassengerInfoId(Integer passengerInfoId);

    List<PassengerAddress> selectPassengerAddressList(Integer PassengerInfoId);

    PassengerAddress selectByAddPassengerInfoId(PassengerAddress passengerInfoId);

    int updateByPrimaryKeySelective(PassengerAddress record);

    int updatePassengerAddress(PassengerAddress record);

    int updateByPrimaryKey(PassengerAddress record);
}
