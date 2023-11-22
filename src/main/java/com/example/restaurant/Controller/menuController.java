package com.example.restaurant.Controller;

import com.example.restaurant.Entity.Menu;
import com.example.restaurant.Repository.MenuRepository;
import com.example.restaurant.Service.Implementations.MenuImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class menuController {
    @Autowired
    private MenuImpl menuimpl;
//    @PostMapping("/addFood")
//    public Menu addFood(@RequestBody Menu menu) {
//     return menuimpl.save(menu);

    @PostMapping("/addFood")
    public Menu addFood(@RequestBody Menu menu) {
        // Logic to add food to the menu
        return menuimpl.save(menu);
    }
    @PutMapping("/editFood")
    public Menu editFood(@RequestBody Menu menu) {
        return menuimpl.save(menu);
    }
    @DeleteMapping("/deleteFood")
    public void deleteFood(@RequestBody Menu menu) {
        menuimpl.Delete(menu);
    }
    @GetMapping("/showMenu")
    public List<Menu> showMenu(){
        return menuimpl.show();
    }
}
