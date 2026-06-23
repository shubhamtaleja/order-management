package com.example.ordermanagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.example.ordermanagement.service.IOrderService;
import com.example.ordermanagement.model.OrderHeader;
import com.example.ordermanagement.model.OrderDetails;
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public ResponseEntity<OrderHeader> createOrder(@RequestBody OrderHeader orderHeader) {
        return ResponseEntity.ok(orderService.createOrder(orderHeader));
    }
}
