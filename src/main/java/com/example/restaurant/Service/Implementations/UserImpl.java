package com.example.restaurant.Service.Implementations;

import com.example.restaurant.Entity.User;
import com.example.restaurant.Repository.UserRepository;
import com.example.restaurant.Service.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

@Autowired
 UserRepository userRepository;

    public List<User> showAll() {
        return userRepository.findAll();
    }

    @Override
    public User addCourse(User user) {
        return userRepository.save(user);
    }


    @Override
    public User addUser(User user) { return userRepository.save(user);}

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}


