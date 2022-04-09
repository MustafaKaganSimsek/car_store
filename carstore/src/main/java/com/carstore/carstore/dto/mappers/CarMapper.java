package com.carstore.carstore.dto.mappers;

import com.carstore.carstore.dto.CarAdminDto;
import com.carstore.carstore.dto.CarDto;
import com.carstore.carstore.model.Car;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    Car carAdminToCar(CarAdminDto carAdminDto);
    CarAdminDto carToCarAdminDto(Car car);

    //Car carDtoToCar(CarDto carDto);
    CarDto carToCarDto(Car car);

    List<CarAdminDto> carToCarAdminDto(List<Car> car);
}
