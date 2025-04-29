package com.example.MobileVerification.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobileNumberResponsedto {
    private Boolean valid;
    @JsonProperty(value = "country_code")
    private String countryCode;
    @JsonProperty(value = "country_name")
    private String countryName;
    @JsonProperty(value = "carrier")
    private String operatorName;
}
