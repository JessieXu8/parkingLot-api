package com.oocl.parkingLot.service;

import com.oocl.parkingLot.entity.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ParkingLotService {
    Map<Integer,ParkingLot> parkingLots = new HashMap<>();

    public ParkingLot addParkingLot(ParkingLot newParkingLot) {
        parkingLots.put(newParkingLot.getParkingLotId(),newParkingLot);
        return newParkingLot;
    }
}
