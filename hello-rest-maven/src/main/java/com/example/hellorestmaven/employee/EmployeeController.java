package com.example.hellorestmaven.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class EmployeeController {

    @Autowired
    private MyRandom random;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            return new EmployeeResponse(_id, "Can't", "Convert");
        }

        int number = (new MyRandom()).nextInt(10);
        return new EmployeeResponse(_id, "Someone"+number, "Something");
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
}
