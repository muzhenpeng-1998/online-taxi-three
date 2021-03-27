package com.golike.accountservice.request;

import lombok.Data;

/**
 * @date 2018/10/24
 */
@Data
public class PassengerInfoExtRequest {

    private Integer id;

    private Integer isContact;

    private Integer isShare;

    private String sharingTime;
}
