package com.carstore.carstore.service;

import com.carstore.carstore.dto.DemandAdminDto;
import com.carstore.carstore.dto.DemandDto;
import com.carstore.carstore.dto.mappers.DemandMapper;
import com.carstore.carstore.exception.EntityNotFoundException;
import com.carstore.carstore.model.Car;
import com.carstore.carstore.model.Demand;
import com.carstore.carstore.repository.DemandReporsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemandService {

    private final DemandMapper mapper;
    private final CarService carService;
    private final DemandReporsitory demandReporsitory;

    public void setDemand(DemandAdminDto demandAdminDto) throws EntityNotFoundException{
        if(!carService.isPresent(demandAdminDto.getCar_id())){
            throw new EntityNotFoundException("Not Found The Car");
        }
        Demand demand = mapper.demandAdminDtoToDemand(demandAdminDto);
        demandReporsitory.save(demand);
    }

    public List<DemandDto> getDemand(){

        return mapper.demandToDemandDto(demandReporsitory.findAll());

    }
}
