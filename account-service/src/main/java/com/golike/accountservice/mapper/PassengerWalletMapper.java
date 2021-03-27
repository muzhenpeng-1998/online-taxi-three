package com.golike.accountservice.mapper;

import org.springframework.stereotype.Service;

import com.golike.internalservice.entity.PassengerWallet;

/**
 * @date 2018/09/05
 */
@Service
public interface PassengerWalletMapper {

    int insertSelective(PassengerWallet record);

}
