package com.example.restaurant.Service.Implementations;

import com.example.restaurant.Entity.Order;
import com.example.restaurant.Repository.OrderRepository;
import com.example.restaurant.Repository.UserRepository;
import com.example.restaurant.Service.Interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

@Service
public class OrderImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;


    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

}
