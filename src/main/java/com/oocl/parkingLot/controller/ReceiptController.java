package com.oocl.parkingLot.controller;

import com.oocl.parkingLot.entity.Receipt;
import com.oocl.parkingLot.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiptController {
    @Autowired
    ReceiptService receiptService;
    @GetMapping("/receipts")
    public Receipt generateReceiptId(){
        return receiptService.generateReceiptId();
    }
}
