package com.example.restaurant.Service.Interfaces;

import com.example.restaurant.Entity.Menu;

import java.util.List;

public interface MenuService {
   public Menu save(Menu menu);
    //  Menu save(Menu menu);

 public Menu addFood(Menu menu);

    public Menu editFood(Menu menu);

    //public Menu deleteFood(Menu menu);

    public List<Menu> show();


   public void Delete(Menu menu);

}
