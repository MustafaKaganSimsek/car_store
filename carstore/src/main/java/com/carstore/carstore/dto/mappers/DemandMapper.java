package com.carstore.carstore.dto.mappers;

import com.carstore.carstore.dto.CarAdminDto;
import com.carstore.carstore.dto.CarDto;
import com.carstore.carstore.dto.DemandAdminDto;
import com.carstore.carstore.dto.DemandDto;
import com.carstore.carstore.model.Car;
import com.carstore.carstore.model.Demand;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemandMapper {

    Demand demandDtoToDemand(DemandDto demandDto);
    DemandDto demandToDemandDto(Demand demand);
    List<DemandDto> demandToDemandDto(List<Demand> demands);

    Demand demandAdminDtoToDemand(DemandAdminDto demandAdminDto);
    DemandAdminDto demandToDemandAdminDto(Demand demand);


}
