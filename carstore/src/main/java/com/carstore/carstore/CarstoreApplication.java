package com.carstore.carstore;

import com.carstore.carstore.model.Car;
import com.carstore.carstore.repository.CarRepository;
import org.aspectj.apache.bcel.generic.FieldGenOrMethodGen;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarstoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(CarstoreApplication.class, args);
	}



}
