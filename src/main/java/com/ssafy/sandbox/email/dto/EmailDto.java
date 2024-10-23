package com.ssafy.sandbox.email.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailDto {

    private String email;

    public static EmailDto of(String email) {
        return EmailDto.builder()
                .email(email)
                .build();
    }
}
