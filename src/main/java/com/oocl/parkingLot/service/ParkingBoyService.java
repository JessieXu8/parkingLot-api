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

    public List<ParkingLot> addParkingLotToParkingBoyById(int pbid, ParkingLot parkingLot) {
        parkingLot.setParkingBoyId(pbid);
        ParkingBoy parkingBoy = parkingBoys.get(pbid);
        List<ParkingLot> parkingLotList= parkingBoy.getParkingLots();
        parkingLotList.add(parkingLot);
        return parkingBoys.get(pbid).getParkingLots();
    }

    public List<ParkingBoy> getParkingBoys() {
        List<ParkingBoy> parkingBoyList = new ArrayList<>();
        for (Integer i : parkingBoys.keySet()){
            parkingBoyList.add(parkingBoys.get(i));
        }
        return parkingBoyList;
    }

    public List<ParkingLot> getParkingLotsByParkingBoyId(int pbid) {
        return parkingBoys.get(pbid).getParkingLots();
    }
}
