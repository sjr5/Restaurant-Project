package com.example.restaurant.Controller;

import com.example.restaurant.Entity.Order;
import com.example.restaurant.Repository.OrderRepository;
import com.example.restaurant.Service.Implementations.OrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class orderController {
    @Autowired
   private OrderImpl orderimpl;

    @DeleteMapping("/cancelOrder")
    public Order cancelOrder(Order order) {return orderimpl.cancelOrder(order);}

}
