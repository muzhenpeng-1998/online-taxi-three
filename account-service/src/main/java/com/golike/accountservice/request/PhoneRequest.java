package com.golike.accountservice.request;

import com.online.taxi.dto.phone.PhoneInfoView;
import lombok.Data;

import java.util.List;

/**
 * @date 2018/08/15
 **/
@Data
public class PhoneRequest {

    private Integer idType;

    private List<PhoneInfoView> infoList;

}
