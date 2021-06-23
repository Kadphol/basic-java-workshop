package com.example.hellorestmaven.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class EmployeeService {

    @Autowired
    private Random random;

    @Autowired
    private EmployeeRepository repository;

    public EmployeeResponse process(int id) {
        Optional<Employee> result = repository.findById(id);
        if(result.isPresent()) {
            Employee employee = result.get();
            int number = random.nextInt(10);
            return new EmployeeResponse(employee.getId(), employee.getFirstName()+number, employee.getLastName());
        }
        //not found
        return new EmployeeResponse();
    }
}
