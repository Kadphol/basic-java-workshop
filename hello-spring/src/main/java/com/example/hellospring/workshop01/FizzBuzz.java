package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String getFizzBuzz(int input) {
        if(input == 3) return "Fizz";
        if(input == 5) return "Buzz";
        return Integer.toString(input);
    }
}