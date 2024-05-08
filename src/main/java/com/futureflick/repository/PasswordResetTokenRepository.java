package com.futureflick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futureflick.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
