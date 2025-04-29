package com.example.MobileVerification.controller;

import com.example.MobileVerification.dto.MobileNumberCleanResponsedto;
import com.example.MobileVerification.service.MobileVerificationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/verify")
@RequiredArgsConstructor
public class MobileVerificationController {
    private final MobileVerificationServiceImpl mobileVerificationService;


    @GetMapping("/{phoneNumber}")
    public ResponseEntity<MobileNumberCleanResponsedto> verifyNumber(@PathVariable String phoneNumber) {
        return ResponseEntity.ok(mobileVerificationService.checkPhoneNumber(phoneNumber));
    }


}

