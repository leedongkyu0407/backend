package com.ssafy.sandbox.email.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailSendRequest {

    private String email;

    public static EmailSendRequest of(String email) {
        return EmailSendRequest.builder()
                .email(email)
                .build();
    }
}
