package com.eliasr.CyclingAPI.repository;

import com.eliasr.CyclingAPI.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

    boolean existsByTeamName(String teamName);

    Team findByTeamName(String teamName);
}
