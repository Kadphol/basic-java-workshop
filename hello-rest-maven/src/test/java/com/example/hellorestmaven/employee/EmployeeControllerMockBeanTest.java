package com.example.hellorestmaven.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerMockBeanTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EmployeeRepository repository;

    @MockBean
    private Random random;

    @Test
    public void callApiWithPathVariableWithOutDatabase() {
        //Mock
        when(random.nextInt(10)).thenReturn(5);

        Employee mock = new Employee(123,"Mock fname", "Mock lname");
        when(repository.findById(123)).thenReturn(
                Optional.of(mock)
        );

        //Test
        EmployeeResponse expected = new EmployeeResponse(123, "Mock fname5", "Mock lname");
        EmployeeResponse response =
                restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(123, response.getId());
        assertEquals("Mock fname5", response.getFname());
        assertEquals("Mock lname", response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithPathVariableWithOutDatabaseFail() {
        //Mock
        when(random.nextInt(10)).thenReturn(5);

        when(repository.findById(123)).thenReturn(
                Optional.empty()
        );

        //Test
        EmployeeResponse response =
                restTemplate.getForObject("/employee/123", EmployeeResponse.class);
        assertEquals(0, response.getId());
        assertNull(response.getFname());
        assertNull(response.getLname());
    }
}