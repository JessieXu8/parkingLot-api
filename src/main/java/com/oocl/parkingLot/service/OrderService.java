package com.oocl.parkingLot.service;

import com.oocl.parkingLot.controller.ParkingBoyController;
import com.oocl.parkingLot.entity.Order;
import com.oocl.parkingLot.entity.ParkingBoy;
import com.oocl.parkingLot.entity.ParkingLot;
import com.oocl.parkingLot.entity.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    ParkingBoyService parkingBoyService;

    List<Order> orderList = new ArrayList<>();
    public Order generateOrder(UUID receiptId) {
        Order order = new Order();
        order.setReceiptId(receiptId);
        orderList.add(order);
        return order;
    }

    public List<Order> getOrders() {
        return orderList;
    }

    public Order getOrderByParkingBoyId(int parkingBoyId) {
        List<ParkingBoy> parkingBoys = parkingBoyService.getParkingBoys();
        if(orderList.size()==0){
            return null;
        }
        for(int i =0;i<parkingBoys.size();i++){
            if (parkingBoys.get(i).getParkingBoyId()==parkingBoyId){
                List<ParkingLot> parkingLotList = parkingBoys.get(i).getParkingLots();
                for(int j=0;j<parkingLotList.size();j++){
                    if(!parkingLotList.get(j).isfull()){
                        int currentsize = parkingLotList.get(j).getUsedSize()+1;
                        parkingLotList.get(j).setUsedSize(currentsize);
                        orderList.get(0).setParkingLotId(parkingLotList.get(j).getParkingLotId());
                    }
                }
                orderList.get(0).setStatus(true);
                return orderList.get(0);
            }
        }
        return null;
    }

    public Receipt getUnparkedReceiptByReceiptId(UUID receiptId) {
        for(int i =0;i<orderList.size();i++){
            Order order = orderList.get(i);
            if (order.getReceiptId().toString().equals(receiptId.toString()) && order.isStatus()){
                Receipt receipt = new Receipt();
                receipt.setReceiptID(receiptId);
                orderList.remove(order);
                return receipt;
            }
        }
        return null;
    }
}
