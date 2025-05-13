package com.eliasr.CyclingAPI.controller;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.dto.rider.RiderRQ;
import com.eliasr.CyclingAPI.entity.Rider;
import com.eliasr.CyclingAPI.service.rider.IRiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
public class RiderController {

    @Autowired
    private IRiderService riderService;


    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<String> createRider(@RequestBody RiderRQ rider) throws Exception {

        return  riderService.createRider(rider);

    }
}
