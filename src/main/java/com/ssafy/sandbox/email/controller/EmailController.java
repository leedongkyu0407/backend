package com.ssafy.sandbox.email.controller;

import com.ssafy.sandbox.email.dto.EmailDto;
import com.ssafy.sandbox.email.dto.EmailResponse;
import com.ssafy.sandbox.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;
    @PostMapping()
    public ResponseEntity<EmailResponse> sendEmail(@RequestBody EmailDto emailDto) {
        log.debug("Sending email: {}", emailDto.getEmail());
        EmailResponse emailResponse = emailService.sendEmail(emailDto);
        return ResponseEntity.ok(emailResponse);
    }
}
