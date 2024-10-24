package com.ssafy.sandbox.email.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailSendResponse {

    private boolean isOk;

    public static EmailSendResponse of(boolean isOk){
        return EmailSendResponse.builder()
                .isOk(isOk)
                .build();
    }

    public boolean getIsOk(){
        return isOk;
    }
}
