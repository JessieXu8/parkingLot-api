package com.oocl.parkingLot.controller;

import com.oocl.parkingLot.entity.ParkingLot;
import com.oocl.parkingLot.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingLotController {
    @Autowired
    ParkingLotService parkingLotService;
    @PostMapping("/parkingLots")
    public ParkingLot addParkingLot(@RequestBody ParkingLot newParkingLot){
        return parkingLotService.addParkingLot(newParkingLot);
    }

}
