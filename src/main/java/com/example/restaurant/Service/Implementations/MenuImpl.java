package com.example.restaurant.Service.Implementations;

import com.example.restaurant.Entity.Menu;
import com.example.restaurant.Entity.Order;
import com.example.restaurant.Repository.MenuRepository;
import com.example.restaurant.Service.Interfaces.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuImpl implements MenuService {
    @Autowired
    MenuRepository menuRepository;


    @Override
    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu addFood(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu editFood(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public List<Menu> show() {
        return menuRepository.findAll();
    }

    @Override
    public void Delete(Menu menu) {
        menuRepository.delete(menu);
    }
}


