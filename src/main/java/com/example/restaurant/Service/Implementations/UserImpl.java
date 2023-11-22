package com.example.restaurant.Service.Implementations;

import com.example.restaurant.Entity.User;
import com.example.restaurant.Repository.UserRepository;
import com.example.restaurant.Service.Interfaces.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class UserImpl implements UserService {

 @Autowired
 UserRepository userRepository;


 @Override
 public List<User> showAll() {
  return userRepository.findAll();
 }

 @Override
 public User save(User user) {
  return userRepository.save(user);
 }

 @Override
 public List<User> doShowAll() {
  return doShowAll();
 }
}






