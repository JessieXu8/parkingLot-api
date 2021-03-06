package com.oocl.parkingLot.controller;

import com.oocl.parkingLot.entity.ParkingBoy;
import com.oocl.parkingLot.entity.ParkingLot;
import com.oocl.parkingLot.service.ParkingBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingBoyController {
    @Autowired
    ParkingBoyService parkingBoyService;
    @PostMapping("/parkingBoys")
    public ParkingBoy addParkingBoy(@RequestBody ParkingBoy newParkingBoy){
        return parkingBoyService.addParkingBoy(newParkingBoy);
    }

    @GetMapping("/parkingBoys")
    public List<ParkingBoy> getParkingBoys(){
        return parkingBoyService.getParkingBoys();
    }

    @PutMapping("/parkingBoys/{pbid}")
    public List<ParkingLot> addParkingLotToParkingBoyById(@PathVariable int pbid,@RequestBody ParkingLot parkingLot){
        return parkingBoyService.addParkingLotToParkingBoyById(pbid,parkingLot);
    }

    @GetMapping("/parkingBoys/{pbid}")
    public List<ParkingLot> getParkingLotsByParkingBoyId(@PathVariable int pbid){
        return parkingBoyService.getParkingLotsByParkingBoyId(pbid);
    }

}
