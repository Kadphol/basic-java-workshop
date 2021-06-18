package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void case01() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(1);
        assertEquals("1",result);
    }
}