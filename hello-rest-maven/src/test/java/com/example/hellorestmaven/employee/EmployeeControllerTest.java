package com.example.hellorestmaven.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callApiWithPathVariable() {
        EmployeeResponse response =
                restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(123, response.getId());
        assertEquals("Someone", response.getFname());
        assertEquals("Something", response.getLname());
    }

    @Test
    public void callApiWithParameter() {
        EmployeeResponse response =
                restTemplate.getForObject("/employee/?id=999", EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Someone", response.getFname());
        assertEquals("Something", response.getLname());
    }
}