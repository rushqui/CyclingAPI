package com.eliasr.CyclingAPI.repository;

import com.eliasr.CyclingAPI.entity.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiderRepository extends JpaRepository<Rider, Long> {

}
