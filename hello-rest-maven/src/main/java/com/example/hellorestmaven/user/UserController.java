package com.example.hellorestmaven.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserGateway userGateway;

    @GetMapping("/users")
    public List<UserModel> getUsers() {
        List<UserModel> users = userGateway.getAllUsers();
        return users.stream().filter(user -> user.getId()%2==0).collect(Collectors.toList());
    }
}
