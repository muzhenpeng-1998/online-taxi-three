package com.golike.accountservice.service;


import com.golike.accountservice.request.GetTokenRequest;
import com.golike.internalservice.dto.ResponseResult;
import com.golike.internalservice.entity.PassengerInfo;
import com.golike.internalservice.entity.PassengerRegisterSource;

import java.util.HashMap;

/**
 * @date 2018/08/15
 **/
public interface PassengerInfoService {

     PassengerInfo queryPassengerInfoByPhoneNum(String phoneNum);

     void insertPassengerInfo(PassengerInfo passengerInfo) ;

     void updatePassengerInfoLoginTime(Integer passengerId);

     HashMap<String, Object> getPassengerInfoView(GetTokenRequest getTokenRequest);

     ResponseResult updatePassengerInfo(PassengerInfo passengerInfo);

     int initPassengerWallet(Integer passengerId);

     PassengerInfo queryPassengerInfoById(Integer passengerId);

     int insertPassengerRegisterSource(PassengerRegisterSource passengerRegisterSource);

     int updatePassengerInfoById(PassengerInfo passengerInfo);
}
