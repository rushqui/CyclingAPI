package com.eliasr.CyclingAPI.service.rider;

import com.eliasr.CyclingAPI.dto.GenericResponse;
import com.eliasr.CyclingAPI.dto.rider.RiderRQ;
import com.eliasr.CyclingAPI.entity.Rider;
import org.springframework.stereotype.Component;

@Component
public interface IRiderService {

    GenericResponse<String> createRider(RiderRQ rider) throws Exception;
}
