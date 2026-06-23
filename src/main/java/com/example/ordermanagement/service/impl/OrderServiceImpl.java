package com.example.ordermanagement.service.impl;

import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;
import com.example.ordermanagement.service.IOrderService;
import com.example.ordermanagement.model.OrderHeader;
import com.example.ordermanagement.model.OrderDetails; 
import com.example.ordermanagement.repository.OrderHeaderRepository;
@Service
public class OrderServiceImpl implements IOrderService {

    private final OrderHeaderRepository orderHeaderRepository;

    public OrderServiceImpl(OrderHeaderRepository orderHeaderRepository) {
        this.orderHeaderRepository = orderHeaderRepository;
    }

    @Override
    @Transactional
    public OrderHeader createOrder(OrderHeader orderHeader) {
        if (orderHeader.getOrderDetails() != null) {
            for (OrderDetails detail : orderHeader.getOrderDetails()) {
                detail.setOrderHeader(orderHeader);
            }
        }
        return orderHeaderRepository.save(orderHeader);
    }
}
