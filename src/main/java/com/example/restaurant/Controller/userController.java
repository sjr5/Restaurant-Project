package com.example.restaurant.Controller;

import com.example.restaurant.Entity.Menu;
import com.example.restaurant.Entity.User;
import com.example.restaurant.Repository.UserRepository;
import com.example.restaurant.Service.Implementations.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/user")
@RestController
public class userController {

@Autowired
private UserImpl userimpl;

  @GetMapping("/showAll")
  public List<User> show(){
       return userimpl.showAll();
 }
 @PostMapping ("/addUser")
 public User addUser(@RequestBody User user){
       return userimpl.save(user);
  }

//  @PostMapping ("/createOrder")
//  public User createOrder(@RequestBody User order){ return userimpl.save(order);}
//
//    @PutMapping("/editOrder")
//    public User editOrder(@RequestBody User user){return userimpl.save(user);}
}






