//package com.example.restaurant.Service.Interfaces;
//
//import com.example.restaurant.Entity.Order;
//import com.example.restaurant.Entity.User;
//import com.example.restaurant.Repository.OrderRepository;
//import com.example.restaurant.Repository.UserRepository;
//import com.example.restaurant.Service.Implementations.OrderImpl;
//import com.example.restaurant.Service.Implementations.UserImpl;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.context.WebApplicationContext;
//import sun.security.krb5.internal.ccache.MemoryCredentialsCache;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
//class OrderServiceTest {
//    @Autowired
//    private OrderImpl orderImpl;
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//    @Autowired
//    private OrderRepository orderRepository;
//
//    private MockMvc mockMvc;
//
//    private final ObjectMapper mapper = new ObjectMapper();
//
//    @Test
//    public void orderIdTest() {
//        // Create mock objects for the Order and OrderImpl classes.
//        Order order = Mockito.mock(Order.class);
//        OrderImpl orderImpl = Mockito.mock(OrderImpl.class);
//
//        // Set up the mock objects.
//        Mockito.when(orderImpl.save(order)).thenReturn(order);
//
//        // Create a new Order object.
//        Order newOrder = new Order();
//
//        // Call the orderId() method.
//        Order addedOrder = orderId(newOrder);
//
//        // Assert that the addedOrder object is the same as the newOrder object.
//        assertEquals(newOrder, addedOrder);
//    }
//
//    private Order orderId(Order order) {
//        Object Orderimpl;
//        MemoryCredentialsCache orderimpl = new MemoryCredentialsCache(Orderimpl);
//        return orderimpl.save(order);
//    }
//    public UserServiceImpl(UserImpl userImpl) {
//        this.userImpl = userImpl;
//    }
//
//    @Override
//    public List<User> showAll() {
//        return doShowAll();
//    }
//
//    @Override
//    public User save(User user) {
//        return user;
//    }
//
//    @Override
//    public List<User> doShowAll() {
//        // Retrieve the users from the database here.
//        return userImpl.showAll();
//    }
//}