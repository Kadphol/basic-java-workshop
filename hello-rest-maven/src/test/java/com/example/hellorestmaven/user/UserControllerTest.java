package com.example.hellorestmaven.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getUsersTest() {
        UserModel[] result = restTemplate.getForObject("/users",UserModel[].class);
        assertEquals(5, result.length);
        for (UserModel user : result) {
            assertEquals(user.getId() % 2, 0);
        }
    }
}