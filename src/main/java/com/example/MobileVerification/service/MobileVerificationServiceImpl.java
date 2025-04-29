package com.example.MobileVerification.service;

import com.example.MobileVerification.client.NumVerifyClient;
import com.example.MobileVerification.dto.MobileNumberCleanResponsedto;
import com.example.MobileVerification.dto.MobileNumberResponsedto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileVerificationServiceImpl implements MobileVerificationService {
private final NumVerifyClient numVerifyClient;
    private final ModelMapper modelMapper;
    @Value("${ACCESS_TOKEN}")
    private String accessToken;
    @Override
    public MobileNumberCleanResponsedto checkPhoneNumber(String phoneNumber) {
        int format = 1;

        //Call the external API using Feign Client
        // String response = numVerifyClient.validateNumber(apiKey,phoneNumber);
        try {
            MobileNumberResponsedto response = numVerifyClient.validateNumber(accessToken, phoneNumber, format);
            if (response.getValid() == null || !response.getValid()) {
                throw new RuntimeException("Invalid number");
            }
            // Map the response to a clean response DTO
            MobileNumberCleanResponsedto cleanResponse = modelMapper.map(response, MobileNumberCleanResponsedto.class);
            return cleanResponse;
        } catch (Exception e) {
            throw new RuntimeException("Error validating number: " + e.getMessage(), e);
        }
    }
}


