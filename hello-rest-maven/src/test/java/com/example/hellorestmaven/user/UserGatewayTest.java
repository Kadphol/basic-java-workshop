package com.example.hellorestmaven.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void callAPI() {
        Users users = userGateway.getAllUsers();
        assertEquals(10, users.getUsers().size());
    }

    @Test
    public void callAPIGetByID() {
        UserModel user = userGateway.getUserByID(1);
        assertEquals(1, user.getId());
    }

}