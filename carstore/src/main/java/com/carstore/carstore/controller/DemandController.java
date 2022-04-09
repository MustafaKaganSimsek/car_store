package com.carstore.carstore.controller;

import com.carstore.carstore.dto.CarDto;
import com.carstore.carstore.dto.DemandAdminDto;
import com.carstore.carstore.dto.DemandDto;
import com.carstore.carstore.exception.EntityNotFoundException;
import com.carstore.carstore.service.DemandService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demand")
@AllArgsConstructor
public class DemandController {

    private final DemandService demandService;

    @PostMapping("/form")
    public ResponseEntity<DemandAdminDto> setDemand(@RequestBody DemandAdminDto demandAdminDto) throws EntityNotFoundException {

        demandService.setDemand(demandAdminDto);
        return ResponseEntity.ok(demandAdminDto) ;
    }

    @GetMapping("/table")
    public ResponseEntity<List<DemandDto>> getDemand(){
        return ResponseEntity.ok(demandService.getDemand());

    }
}
