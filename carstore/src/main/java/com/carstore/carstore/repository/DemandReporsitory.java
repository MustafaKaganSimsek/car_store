package com.carstore.carstore.repository;

import com.carstore.carstore.model.Demand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandReporsitory extends JpaRepository<Demand,Integer> {
}
