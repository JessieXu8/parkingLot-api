package com.oocl.parkingLot.entity;

import org.springframework.stereotype.Component;

@Component
public class ParkingLot {

    private int parkingLotId;
    private int parkingBoyId;
    private int size;
    private int usedSize;

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public boolean isfull(){
        if((size-usedSize)>0){
            return false;
        }
        return true;
    }
}
