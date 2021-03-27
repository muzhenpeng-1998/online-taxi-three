package com.golike.accountservice.service;

import com.golike.accountservice.request.GetTokenRequest;
import com.golike.internalservice.dto.ResponseResult;

/**
 * @date 2018/08/15
 **/
public interface PassengerRegistHandleService {

     ResponseResult handle(GetTokenRequest getTokenRequest) ;

     ResponseResult checkOut(GetTokenRequest request) throws Exception;
}
