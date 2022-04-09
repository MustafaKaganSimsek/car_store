package com.carstore.carstore.dto.mappers;

import com.carstore.carstore.dto.CarAdminDto;
import com.carstore.carstore.dto.CarAdminDto.CarAdminDtoBuilder;
import com.carstore.carstore.dto.CarDto;
import com.carstore.carstore.dto.CarDto.CarDtoBuilder;
import com.carstore.carstore.model.Car;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-23T16:32:17+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public Car carAdminToCar(CarAdminDto carAdminDto) {
        if ( carAdminDto == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( carAdminDto.getId() );
        car.setName( carAdminDto.getName() );
        car.setPrice( carAdminDto.getPrice() );

        return car;
    }

    @Override
    public CarAdminDto carToCarAdminDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarAdminDtoBuilder carAdminDto = CarAdminDto.builder();

        carAdminDto.id( car.getId() );
        carAdminDto.name( car.getName() );
        carAdminDto.price( car.getPrice() );

        return carAdminDto.build();
    }

    @Override
    public CarDto carToCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDtoBuilder carDto = CarDto.builder();

        carDto.name( car.getName() );
        carDto.price( car.getPrice() );

        return carDto.build();
    }

    @Override
    public List<CarAdminDto> carToCarAdminDto(List<Car> car) {
        if ( car == null ) {
            return null;
        }

        List<CarAdminDto> list = new ArrayList<CarAdminDto>( car.size() );
        for ( Car car1 : car ) {
            list.add( carToCarAdminDto( car1 ) );
        }

        return list;
    }
}
