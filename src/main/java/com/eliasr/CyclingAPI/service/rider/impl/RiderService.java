package com.eliasr.CyclingAPI.service.rider.impl;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.dto.rider.RiderRQ;
import com.eliasr.CyclingAPI.entity.Rider;
import com.eliasr.CyclingAPI.entity.Team;
import com.eliasr.CyclingAPI.repository.RiderRepository;
import com.eliasr.CyclingAPI.repository.TeamRepository;
import com.eliasr.CyclingAPI.service.rider.IRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RiderService implements IRiderService {

    @Autowired
    private RiderRepository riderRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public GenericResponse<String> createRider(RiderRQ rider) throws Exception {

        GenericResponse<String> response = new GenericResponse<>();
        Team team = teamRepository.findByTeamName(rider.getTeamName());

        if (team == null){
            throw new Exception("No existe un equipo registrado como: " + rider.getTeamName());
        }

        System.out.println(team);

        Rider newRider = riderRepository.save(new Rider(rider, team));

        response.setCode("200");
        response.setMessage("Success");
        response.setResponse("Rider created:" + newRider.getName());

        return response;
    }
}
