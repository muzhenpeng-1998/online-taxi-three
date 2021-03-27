package com.golike.accountservice.dao;

import com.golike.accountservice.mapper.PassengerWalletMapper;
import com.golike.internalservice.entity.PassengerWallet;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @date 2018/8/20
 */
@Repository
@RequiredArgsConstructor
public class PassengerWalletDao {

    @NonNull
    private PassengerWalletMapper passengerWalletMapper;

    public int insertSelective(PassengerWallet record){
        return passengerWalletMapper.insertSelective(record);
    }

}
