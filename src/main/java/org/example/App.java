package org.example;

import org.example.config.Configuration;
import org.example.model.User;
import org.example.service.PhoneService;
import org.example.service.UserService;
import org.example.service.serviceImpl.PhoneServiceImpl;
import org.example.service.serviceImpl.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        UserService userService = new UserServiceImpl();
        System.out.println(userService.getAllSortedUsers("Asc"));
//        userService.createUserTable();
//        System.out.println(userService.getUserById(3L));
//        userService.updateUserInfo(1L, new User("Nurseyit Sadirov", 16));
//        userService.dropUserTable();

        PhoneService phoneService = new PhoneServiceImpl();
//        phoneService.createPhoneTable();
    }
}
