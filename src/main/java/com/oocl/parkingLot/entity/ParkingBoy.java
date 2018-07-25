package com.oocl.parkingLot.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParkingBoy {
    private int parkingBoyId;
    private List<ParkingLot> parkingLots;

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

}
