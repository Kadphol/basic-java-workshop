package com.example.hellorestmaven.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public Users getAllUsers() {
        Users result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Users.class);
        return result;
    }

    public UserModel getUserByID(int id) {
        String url = "https://jsonplaceholder.typicode.com/users/" + id;
        UserModel user = restTemplate.getForObject(url, UserModel.class);
        return user;
    }
}
