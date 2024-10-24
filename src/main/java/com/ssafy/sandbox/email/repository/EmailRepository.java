package com.ssafy.sandbox.email.repository;

import com.ssafy.sandbox.email.domain.SandboxEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<SandboxEmail, String> {
    SandboxEmail findByEmail(String email);
}
