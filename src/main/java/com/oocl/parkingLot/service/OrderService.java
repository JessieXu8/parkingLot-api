package com.oocl.parkingLot.service;

import com.oocl.parkingLot.entity.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
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
}
