package com.ssafy.sandbox.email.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class EmailAuthResponse {

    private final boolean isSuccess;

    public EmailAuthResponse of(boolean isSuccess) {
        EmailAuthResponse build = EmailAuthResponse.builder()
                .isSuccess(isSuccess)
                .build();

        return EmailAuthResponse.builder()
                .isSuccess(isSuccess)
                .build();
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }


}
