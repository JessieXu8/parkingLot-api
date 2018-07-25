package com.oocl.parkingLot.controller;

import com.oocl.parkingLot.entity.Order;
import com.oocl.parkingLot.entity.Receipt;
import com.oocl.parkingLot.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/orders/{receiptId}")
    public Order generateOrder(@PathVariable UUID receiptId){
        return orderService.generateOrder(receiptId);
    }
    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @PutMapping("/orders/{parkingBoyId}")
    public Order getOrderByParkingBoyId(@PathVariable int parkingBoyId){
        return orderService.getOrderByParkingBoyId(parkingBoyId);
    }

    @PutMapping("/orders/receipts/{receiptId}")
    public Receipt getUnparkedReceiptByReceiptId(@PathVariable UUID receiptId){
        return orderService.getUnparkedReceiptByReceiptId(receiptId);
    }
}
