package com.example.restaurant.Controller;

import com.example.restaurant.Entity.Menu;
import com.example.restaurant.Repository.MenuRepository;
import com.example.restaurant.Service.Implementations.MenuImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class menuController {
    @Autowired
    private MenuImpl menuimpl;

  //  @PostMapping("/addFood")
    //public Menu addFood(@RequestBody Menu menu) {
       // return menuimpl.save(menu);
    //}
    //@PutMapping("/editFood")
    //public Menu editFood(@RequestBody Menu menu) {
      //  return menuimpl.save(menu);
    //}
    //@DeleteMapping("/delete/food")
    //public Menu deleteFood(@RequestBody Menu menu) {
      //  return menuimpl.Delete(menu);
    //}
    //@GetMapping("/show/menu")
    //public List<Menu> showMenu(){
      //  return menuimpl.show();
    //}
}
