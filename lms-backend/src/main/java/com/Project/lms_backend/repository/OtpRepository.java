package com.Project.lms_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.lms_backend.model.Otp;

@Repository
public interface OtpRepository extends JpaRepository<Otp, Long> {
    Optional<Otp> findTopByEmailAndTypeAndUsedFalseOrderByCreatedAtDesc(String email, String type);
}
