package com.oocl.parkingLot.service;

import com.oocl.parkingLot.entity.ParkingBoy;
import com.oocl.parkingLot.entity.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ParkingBoyService {
    Map<Integer,ParkingBoy> parkingBoys = new HashMap<>();
    public ParkingBoy addParkingBoy(ParkingBoy newParkingBoy) {
        parkingBoys.put(newParkingBoy.getParkingBoyId(),newParkingBoy);
        return newParkingBoy;
    }
}
