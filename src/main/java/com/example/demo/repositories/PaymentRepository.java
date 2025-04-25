package com.example.demo.repositories;

import com.example.demo.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByTrip_Id(Long tripId);
    List<Payment> findByAmountGreaterThan(Double amount);
}
