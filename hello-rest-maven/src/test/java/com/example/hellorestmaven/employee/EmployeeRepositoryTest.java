package com.example.hellorestmaven.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void foundWithID1() {
        repository.save(new Employee("Someone","Something"));

        Employee employee1 = repository.getById(1);
        assertEquals(1, employee1.getId());
        assertEquals("Someone", employee1.getFirstName());
        assertEquals("Something", employee1.getLastName());
    }
}