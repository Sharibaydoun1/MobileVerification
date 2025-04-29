package com.example.MobileVerification.service;

import com.example.MobileVerification.dto.MobileNumberCleanResponsedto;

public interface MobileVerificationService {
    public MobileNumberCleanResponsedto checkPhoneNumber(String phoneNumber);
}
