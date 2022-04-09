package com.carstore.carstore.controller;

import com.carstore.carstore.dto.CarAdminDto;
import com.carstore.carstore.dto.CarDto;
import com.carstore.carstore.model.Car;
import com.carstore.carstore.repository.CarRepository;
import com.carstore.carstore.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarControler {

    private final CarRepository carRepository ;
    private final CarService carService;

    public CarControler(CarRepository carRepository, CarService carService) {
        this.carRepository = carRepository;
        this.carService = carService;
    }


    @PostMapping("/add")
    public ResponseEntity<CarAdminDto> sendCar(@RequestBody CarAdminDto carAdminDto){

        carService.createCar(carAdminDto);

        return ResponseEntity.ok(carAdminDto);
    }

    @GetMapping()
    public ResponseEntity<List<CarAdminDto>> getCar() {
        List<CarAdminDto> carAdminDto = carService.getCar();

        return ResponseEntity.ok(carAdminDto);
    }

    @DeleteMapping("/delete/{id}")
        public ResponseEntity<Void> deleteItem(@PathVariable int id){
                carService.deleteCar(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<Void> deleteAllCar(){
        carService.deleteAllCar();
        return ResponseEntity.noContent().build();
    }

}
