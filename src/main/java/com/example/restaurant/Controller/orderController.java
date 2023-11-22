package com.example.restaurant.Controller;

import com.example.restaurant.Entity.Order;
import com.example.restaurant.Repository.OrderRepository;
import com.example.restaurant.Service.Implementations.OrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@RestController
public class orderController {
    @Autowired
   private OrderImpl orderimpl;

    @PostMapping("/orderId")
    public Order orderId(@RequestBody Order order){
        return orderimpl.save(order);
    }

//    @DeleteMapping("/cancelOrder")
//    public Order cancelOrder(Order order) {return orderimpl.cancelOrder(order);}

}
