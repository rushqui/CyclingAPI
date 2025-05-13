package com.eliasr.CyclingAPI.service.team;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.entity.Team;
import org.springframework.stereotype.Component;

@Component
public interface ITeamService {

    GenericResponse<String> createTeam(Team team) throws Exception;
}
