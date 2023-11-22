//package com.example.restaurant.Service.Interfaces;
//
//import com.example.restaurant.Entity.Menu;
//import com.example.restaurant.Repository.MenuRepository;
//import com.example.restaurant.Repository.UserRepository;
//import com.example.restaurant.Service.Implementations.MenuImpl;
//import com.example.restaurant.Service.Implementations.OrderImpl;
//import com.example.restaurant.Service.Implementations.UserImpl;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.context.WebApplicationContext;
//import sun.security.krb5.internal.ccache.MemoryCredentialsCache;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class MenuServiceTest {
//    @Autowired
//    private MenuImpl mnueImpl;
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//    @Autowired
//    private MenuRepository mnueRepository;
//
//    private MockMvc mockMvc;
//
//    private final ObjectMapper mapper = new ObjectMapper();
//    @Test
//    public void addFoodTest() {
//        // Create a new Menu object.
//        Menu newMenu = new Menu();
//
//        // Save the new menu to the database.
//        addFood(newMenu);
//
//        // Query the database to verify that the menu was saved correctly.
//        Menu menuFromDatabase = queryDatabaseForMenu(newMenu.getId());
//
//        // Assert that the addedMenu object is the same as the menuFromDatabase object.
//        assertEquals(newMenu, menuFromDatabase);
//    }
//
//    private Menu addFood(Menu menu) {
//        MemoryCredentialsCache menuimpl;
//        return menuimpl.save(menu);
//    }
//
//    private Menu queryDatabaseForMenu(long id) {
//        // Query the database to retrieve the menu with the specified ID.
//        return null;
//    }
//
//    @Test
//    public void editFoodTest() {
//        // Create a new Menu object.
//        Menu newMenu = new Menu();
//
//        // Save the new menu to the database.
//        mnueImpl.editFood();
//
//        // Query the database to verify that the menu was saved correctly.
//        Menu menuFromDatabase = queryDatabaseForMenu(newMenu.getId());
//
//        // Assert that the addedMenu object is the same as the menuFromDatabase object.
//        assertEquals(newMenu, menuFromDatabase);
//    }
//
//    private Menu addFood(Menu menu) {
//        MemoryCredentialsCache menuimpl;
//        return menuimpl.save(menu);
//    }
//
//    private Menu queryDatabaseForMenu(long id) {
//        // Query the database to retrieve the menu with the specified ID.
//        return null;
//    }
//    @Test
//    public void deleteFoodTest() {
//        // Create a new Menu object.
//        Menu newMenu = new Menu();
//
//        // Save the new menu to the database.
//        deleteFood(newMenu);
//
//        // Query the database to verify that the menu was saved correctly.
//        Menu menuFromDatabase = queryDatabaseForMenu(newMenu.getId());
//
//        // Assert that the addedMenu object is the same as the menuFromDatabase object.
//        assertEquals(newMenu, menuFromDatabase);
//    }
//
//    private void deleteFood(Menu newMenu) {
//        return deleteFood(newMenu.getId());
//    }
//
//    private Menu deleteFood(Menu menu) {
//        return menuimpl.save(menu);
//    }
//    @Test
//    public void showMenuTest() {
//        // Create a new Menu object.
//        Menu newMenu = new Menu();
//
//        // Save the new menu to the database.
//        showMenu(newMenu);
//
//        // Query the database to verify that the menu was saved correctly.
//        Menu menuFromDatabase = queryDatabaseForMenu(newMenu.getId());
//
//        // Assert that the addedMenu object is the same as the menuFromDatabase object.
//        assertEquals(newMenu, menuFromDatabase);
//    }
//
//    private void showMenu(Menu newMenu) {
//    }
//
//    private Menu addFood(Menu menu) {
//        return menuimpl.save(menu);
//    }
//}