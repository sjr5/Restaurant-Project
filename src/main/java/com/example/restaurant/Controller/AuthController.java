package com.example.restaurant.Controller;

import com.example.restaurant.Entity.User;
import com.example.restaurant.Repository.UserRepository;
import com.example.restaurant.Service.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Auth")
@RestController
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
//    @PostMapping("/login")
//    public User login(@RequestBody User user){return userService.login(user);}
//    @PostMapping ("/SignUp")
//    public User SignUp(@RequestBody User user){return userService.SignUp(user);}
//

}
