package com.example.restaurant.Service.Interfaces;

import com.example.restaurant.Entity.User;

import java.util.List;

public interface UserService {

   public List<User> showAll();

  public User save(User user);

    List<User> doShowAll();




}
