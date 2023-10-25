package com.example.restaurant.Controller;

import com.example.restaurant.Entity.User;
import com.example.restaurant.Repository.UserRepository;
import com.example.restaurant.Service.Implementations.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

@Autowired
private UserImpl userimpl;

    @GetMapping("/user/showAll")
    public List<User> show(){
        return userimpl.showAll();
  }
   @PostMapping ("/user/addUser")
    public User addUser(@RequestBody User user){
       return userimpl.save(user);
    }
}
