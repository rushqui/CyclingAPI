package com.eliasr.CyclingAPI.controller;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.dto.team.NewBrandBikeTeamRQ;
import com.eliasr.CyclingAPI.entity.Team;
import com.eliasr.CyclingAPI.service.team.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private ITeamService teamService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<String> createTeam(@RequestBody Team team) throws Exception {

        return  teamService.createTeam(team);

    }

    @GetMapping(value = "/all")
    public GenericResponse<List<Team>> getTeams() throws Exception{
        return teamService.getAllTeams();
    }

    @PutMapping(value = "/updateBrand")
    public GenericResponse<Team> updateBranBikeTean(@RequestBody NewBrandBikeTeamRQ brandBikeTeamRQ) throws Exception{
        return teamService.updateTeamBrandBikes(brandBikeTeamRQ);
    }

}
