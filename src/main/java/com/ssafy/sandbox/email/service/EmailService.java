package com.ssafy.sandbox.email.service;

import com.ssafy.sandbox.email.dto.EmailDto;
import com.ssafy.sandbox.email.dto.EmailResponse;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailResponse sendEmail(EmailDto emailDto) {
        String email = emailDto.getEmail();
        String authCode = generateAuthCode();

        try{
//          이메일 발송
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
            mimeMessageHelper.setTo(email);
            mimeMessageHelper.setSubject("인증번호 발송");
            mimeMessageHelper.setText("인증번호는 " + authCode + " 입니다.");
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {

            return EmailResponse.of(false);
        }
        return EmailResponse.of(true);
    }

    private String generateAuthCode() {
        int authCode = (int)(Math.random() * (90000)) + 100000;
        return String.valueOf(authCode);
    }

}
