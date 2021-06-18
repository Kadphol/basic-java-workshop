package com.example.hellospring.workshop01;

public class BuzzRule implements Rule {
    @Override
    public boolean isRule(int input) {
        return input%5 == 0;
    }

    @Override
    public String getResult() {
        return "Buzz";
    }
}
