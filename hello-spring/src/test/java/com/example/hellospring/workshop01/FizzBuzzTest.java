package com.example.hellospring.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("1 => 1")
    public void case01() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(1);
        assertEquals("1",result);
    }

    @Test
    @DisplayName("2 => 2")
    public void case02() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(2);
        assertEquals("2",result);
    }
}