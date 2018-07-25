package com.oocl.parkingLot.controller;

import com.oocl.parkingLot.entity.ParkingBoy;
import com.oocl.parkingLot.entity.ParkingLot;
import com.oocl.parkingLot.service.ParkingBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingBoyController {
    @Autowired
    ParkingBoyService parkingBoyService;
    @PostMapping("/parkingBoys")
    public ParkingBoy addParkingBoy(@RequestBody ParkingBoy newParkingBoy){
        return parkingBoyService.addParkingBoy(newParkingBoy);
    }
}
