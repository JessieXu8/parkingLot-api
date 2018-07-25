package com.oocl.parkingLot.service;

import com.oocl.parkingLot.entity.Receipt;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReceiptService {
    public Receipt generateReceiptId() {
        Receipt receipt = new Receipt();
        receipt.setReceiptID(UUID.randomUUID());
        return receipt;
    }
}
