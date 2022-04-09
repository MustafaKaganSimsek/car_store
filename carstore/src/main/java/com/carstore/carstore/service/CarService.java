package com.carstore.carstore.service;

import com.carstore.carstore.dto.CarAdminDto;
import com.carstore.carstore.dto.mappers.CarMapper;
import com.carstore.carstore.model.Car;
import com.carstore.carstore.repository.CarRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class CarService {

    private final CarRepository carRepository;
    private final CarMapper mapper;



    public void createCar(CarAdminDto carAdminDto) {
        Car car = mapper.carAdminToCar(carAdminDto);
        carRepository.save(car);
    }

    public List<CarAdminDto> getCar(){
        List<Car> car = carRepository.findAll();

        return mapper.carToCarAdminDto(car);

    }

    public void deleteCar(int id){
        Optional<Car> optionalcar = carRepository.findById(id);
        if (!optionalcar.isPresent()) {
            throw new RuntimeException("Not Found Object");
        }
        carRepository.deleteById(id);
    }

    public void deleteAllCar(){
        carRepository.deleteAll();
    }

    public boolean isPresent(int carId) {
        Optional<Car> car = carRepository.findById(carId);
        return car.isPresent();
    }
}
