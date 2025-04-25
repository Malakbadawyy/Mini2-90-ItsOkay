package com.example.demo.repositories;

import com.example.demo.models.Captain;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CaptainRepository extends JpaRepository<Captain, Long> {
    List<Captain> findByAvgRatingScoreGreaterThan(Double rating);
    Captain findByLicenseNumber(String licenseNumber);
}