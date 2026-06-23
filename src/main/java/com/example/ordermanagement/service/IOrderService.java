package com.example.ordermanagement.service;

import com.example.ordermanagement.model.OrderHeader;

public interface IOrderService {

    OrderHeader createOrder(OrderHeader orderHeader);
}
