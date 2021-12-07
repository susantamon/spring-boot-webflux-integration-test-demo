package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OrderService {

    @Autowired
    protected OrderMapper orderMapper;

    @Autowired
    private OrderRepository orderRepository;

    public Mono<Order> saveOrder(Order order) {
        return orderRepository.save(orderMapper.toOrderEntity(order))
                .map(orderMapper::toOrderModel);
    }

    public Mono<Order> getOrder(Integer orderId) {
        return orderRepository.findById(orderId)
                .map(orderMapper::toOrderModel);
    }
}