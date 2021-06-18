package com.example.hellospring.workshop01;

public class FizzBuzz {
    public String getFizzBuzz(int input) {
        if(input%3 == 0 && input %5 == 0) return "FizzBuzz";
        if(input%3 == 0) return "Fizz";
        if(input%5 == 0) return "Buzz";
        return Integer.toString(input);
    }
}