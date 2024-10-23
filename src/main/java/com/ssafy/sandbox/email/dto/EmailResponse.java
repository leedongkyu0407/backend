package com.ssafy.sandbox.email.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailResponse {

    private boolean isOk;

    public static EmailResponse of(boolean isOk){
        return EmailResponse.builder()
                .isOk(isOk)
                .build();
    }

}
