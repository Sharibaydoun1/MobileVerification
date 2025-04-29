package com.example.MobileVerification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobileNumberCleanResponsedto {
    private boolean valid;
    private String countryCode;
    private String countryName;
    private String operatorName;
}
