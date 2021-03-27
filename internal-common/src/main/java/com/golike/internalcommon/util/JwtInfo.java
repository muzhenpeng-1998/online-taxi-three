package com.golike.internalcommon.util;

import lombok.Data;

@Data
public class JwtInfo{
    String subject;
    Long issueDate;
}