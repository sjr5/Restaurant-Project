//package com.example.restaurant.Service.Interfaces;
//
//import com.example.restaurant.Entity.User;
//import com.example.restaurant.Repository.UserRepository;
//import com.example.restaurant.Service.Implementations.UserImpl;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.context.WebApplicationContext;
//
//import static org.junit.jupiter.api.Assertions.*;
//import  java.util.*;
//@SpringBootTest
//class UserServiceTest {
//
//    @Autowired
//    private UserImpl userimpl;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//    @Autowired
//    private UserRepository userRepository;
//
//    private MockMvc mockMvc;
//
//    private final ObjectMapper mapper = new ObjectMapper();
//
////    @Test
////    void showAll() {
////        List<User> userList= userimpl.showAll();
////        assertEquals(5,userList.size());
////    }
////
////    @Test
////    void saveUser() {
////        User addUser = new user();
////        User savedUser = userimpl.save(addUser);
////        assertEquals(5, savedUser.getId());
////        }
//@Test
//public void showAllTest() {
//    // Create a mock UserImpl object.
//    UserImpl userImpl = Mockito.mock(UserImpl.class);
//
//    // Set up the mock UserImpl object.
//    Mockito.when(userImpl.showAll()).thenReturn(Arrays.asList(new User(), new User()));
//
//    // Create a new User service object.
//    @Configuration
//     class MyConfiguration {
//
//        @Bean
//        public UserService userService() {
//            return new UserService() {
//                @Override
//                public List<User> showAll() {
//                    return null;
//                }
//
//                @Override
//                public User save(User user) {
//                    return null;
//                }
//
//                @Override
//                public List<User> doShowAll() {
//                    return null;
//                }
//            };
//        }
//
//        @Override
//        public List<User> showAll() {
//            return null;
//        }
//
//        @Override
//        public User save(User user) {
//            return user;
//        }
//
//        @Override
//        public List<User> doShowAll() {
//            return doShowAll();
//        }
//    };
//
//    // Call the showAll() method.
//    List<User> users = userService.doShowAll();
//
//    // Assert that the users list contains the two mock User objects.
//    assertEquals(2, users.size());
//}
//
//    @Test
//    public void addUserTest() {
//        User user = Mockito.mock(User.class);
//        UserImpl userImpl = Mockito.mock(UserImpl.class);
//        Mockito.when(userImpl.save(user)).thenReturn(user);
//        User newUser = new User();
//        User addedUser = doAddUser(newUser);
//        assertEquals(newUser, addedUser);
//    }
//
//    private User doAddUser(User user) {
//        return user;
//    }
//
//}
