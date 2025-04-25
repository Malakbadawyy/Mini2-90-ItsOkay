package com.example.demo.repositories;

import com.example.demo.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByTripDateBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Trip> findByCaptain_Id(Long captainId);
}