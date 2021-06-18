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

    @Test
    @DisplayName("3 => Fizz")
    public void case03() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(3);
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("4 => 4")
    public void case04() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(4);
        assertEquals("4",result);
    }

    @Test
    @DisplayName("5 => Buzz")
    public void case05() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(5);
        assertEquals("Buzz",result);
    }

    @Test
    @DisplayName("6 => Fizz")
    public void case06() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(6);
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("7 => 7")
    public void case07() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(7);
        assertEquals("7",result);
    }

    @Test
    @DisplayName("8 => 8")
    public void case08() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(8);
        assertEquals("8",result);
    }

    @Test
    @DisplayName("9 => Fizz")
    public void case09() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(9);
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("10 => Buzz")
    public void case10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(10);
        assertEquals("Buzz",result);
    }

    @Test
    @DisplayName("11 => 11")
    public void case11() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(11);
        assertEquals("11",result);
    }

    @Test
    @DisplayName("12 => Fizz")
    public void case12() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(12);
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("15 => FizzBuzz")
    public void case15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    @DisplayName("30 => FizzBuzz")
    public void case30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(30);
        assertEquals("FizzBuzz",result);
    }
}