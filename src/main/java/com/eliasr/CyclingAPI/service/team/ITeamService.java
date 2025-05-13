package com.eliasr.CyclingAPI.service.team;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.dto.team.NewBrandBikeTeamRQ;
import com.eliasr.CyclingAPI.entity.Team;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ITeamService {

    GenericResponse<String> createTeam(Team team) throws Exception;

    GenericResponse<List<Team>> getAllTeams() throws Exception;

    GenericResponse<Team> updateTeamBrandBikes(NewBrandBikeTeamRQ brandBikeTeamRQ) throws Exception;
}
