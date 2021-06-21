package com.example.hellorestmaven.employee;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyRandom extends Random {
    @Override
    public int nextInt(int bound) {
        return 5;
    }
}
