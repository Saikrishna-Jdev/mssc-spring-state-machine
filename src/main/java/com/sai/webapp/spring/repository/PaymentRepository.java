package com.sai.webapp.spring.repository;

import com.sai.webapp.spring.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
