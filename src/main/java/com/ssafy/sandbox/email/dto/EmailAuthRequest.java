package com.ssafy.sandbox.email.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailAuthRequest {
    private String authentication;
    private String email;

    public EmailAuthRequest of(String authentication, String email) {
        return EmailAuthRequest.builder()
                .authentication(authentication)
                .email(email)
                .build();
    }
}
