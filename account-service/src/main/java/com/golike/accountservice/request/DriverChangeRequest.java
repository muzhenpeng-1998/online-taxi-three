package com.golike.accountservice.request;

import com.online.taxi.dto.DriverBaseInfoView;
import lombok.Data;

import java.util.Date;

/**
 * @date 2018/08/15
 **/
@Data
public class DriverChangeRequest  {

    private DriverBaseInfoView data;

    private int id;

    private int driverStatus;

    private int carId;

    private Date searchCreateStartTime;

    private Date searchCreateEndTime;

    private String address;

}
