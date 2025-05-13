package com.eliasr.CyclingAPI.controller;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.entity.Team;
import com.eliasr.CyclingAPI.service.team.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private ITeamService teamService;

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<String> createTeam(@RequestBody Team team) throws Exception {

        return  teamService.createTeam(team);

    }

}
