package com.carstore.carstore.repository;

import com.carstore.carstore.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
}
