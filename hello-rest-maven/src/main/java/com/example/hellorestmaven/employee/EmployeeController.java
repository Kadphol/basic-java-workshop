package com.example.hellorestmaven.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;
import java.util.Random;

@RestController
public class EmployeeController {

    @Bean
    public Random createNewRandom() {
        return new Random();
    }

    @Autowired
    private Random random;

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        int _id;
        EmployeeResponse response;
        Employee employee;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid id :" + id);
        }

        // Call repository
        Optional<Employee> result = repository.findById(_id);
        if(result.isPresent()) {
            employee = result.get();
            int number = random.nextInt(10);
            return new EmployeeResponse(employee.getId(), employee.getFirstName()+number, employee.getLastName());
        }
        //not found
        return new EmployeeResponse();
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            return new EmployeeResponse(_id, "Can't", "Convert");
        }
        return new EmployeeResponse(_id, "Someone", "Something");
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody  EmployeeRequest request) {
        return new EmployeeResponse(999, request.getfName(), request.getlName());
    }
}
