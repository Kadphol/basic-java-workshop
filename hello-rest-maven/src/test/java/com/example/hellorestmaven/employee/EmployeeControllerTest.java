package com.example.hellorestmaven.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EmployeeRepository repository;

    @MockBean
    private Random random;

    @Test
    public void callApiWithPathVariableAndDatabase() {
        //Mock
        when(random.nextInt(10)).thenReturn(5);

        //Create Data
        repository.save(new Employee(123,"Someone", "Something"));

        //Test
        EmployeeResponse expected = new EmployeeResponse(123, "Someone5", "Something");
        EmployeeResponse response =
                restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(123, response.getId());
        assertEquals("Someone5", response.getFname());
        assertEquals("Something", response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithParameter() {
        EmployeeResponse expected = new EmployeeResponse(999, "Someone", "Something");
        EmployeeResponse response =
                restTemplate.getForObject("/employee/?id=999", EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("Someone", response.getFname());
        assertEquals("Something", response.getLname());
        assertEquals(expected, response);
    }

    @Test
    public void postApiCreateNewEmployee() {
        EmployeeRequest request = new EmployeeRequest("name", "lname");
        EmployeeResponse response = restTemplate.postForObject("/employee", request, EmployeeResponse.class);
        assertEquals(999, response.getId());
        assertEquals("name", response.getFname());
        assertEquals("lname", response.getLname());
    }
}