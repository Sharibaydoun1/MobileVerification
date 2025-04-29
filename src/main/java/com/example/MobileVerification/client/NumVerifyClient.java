package com.example.MobileVerification.client;

import com.example.MobileVerification.dto.MobileNumberResponsedto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name = "numVerifyClient", url = "http://apilayer.net/api")
public interface NumVerifyClient {
    @GetMapping("/validate")
    MobileNumberResponsedto validateNumber(@RequestParam("access_key") String apiKey,
                                           @RequestParam("number") String phoneNumber,
                                           @RequestParam("format") int format);
}



