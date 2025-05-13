package com.eliasr.CyclingAPI.service.team.impl;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.dto.team.NewBrandBikeTeamRQ;
import com.eliasr.CyclingAPI.entity.Team;
import com.eliasr.CyclingAPI.repository.TeamRepository;
import com.eliasr.CyclingAPI.service.team.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService implements ITeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public GenericResponse<String> createTeam(Team team) throws Exception {

        GenericResponse<String> response = new GenericResponse<>();
        Team newTeam;

        if(teamRepository.existsByTeamName(team.getTeamName())){
            throw new Exception("Ya existe un equipo con el mismo nombre.");
        }

        newTeam = teamRepository.save(team);

        response.setCode("200");
        response.setMessage("Success");
        response.setResponse("Team created: " + newTeam.getTeamName());



        return response;
    }

    @Override
    public GenericResponse<List<Team>> getAllTeams() throws Exception {

        GenericResponse<List<Team>> response = new GenericResponse<>();

        List<Team> teams = teamRepository.findAll();

        response.setCode("200");
        response.setMessage("Success");
        response.setResponse(teams);


        return response;

    }

    @Override
    public GenericResponse<Team> updateTeamBrandBikes(NewBrandBikeTeamRQ brandBikeTeamRQ) throws Exception {
        GenericResponse<Team> response = new GenericResponse<>();

        Team updateTeam = teamRepository.findByTeamName(brandBikeTeamRQ.getTeamName());
        updateTeam.setBrandBike(brandBikeTeamRQ.getNewBrandBike());
        teamRepository.save(updateTeam);


        response.setCode("200");
        response.setMessage("Success");
        response.setResponse(updateTeam);


        return response;
    }


}
