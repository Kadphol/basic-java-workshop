package com.example.hellospring.workshop01;

public class FizzRule implements Rule {
    @Override
    public boolean isRule(int input) {
        return input%3==0;
    }

    @Override
    public String getResult() {
        return "Fizz";
    }
}
