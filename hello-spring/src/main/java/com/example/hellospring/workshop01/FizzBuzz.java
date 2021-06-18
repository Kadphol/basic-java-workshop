package com.example.hellospring.workshop01;

public class FizzBuzz {
    private FizzRule fizzRule;
    private BuzzRule buzzRule;
    private FizzBuzzRule fizzBuzzRule;

    public FizzBuzz() {
        fizzRule = new FizzRule();
        buzzRule = new BuzzRule();
        fizzBuzzRule = new FizzBuzzRule();
    }

    public String getFizzBuzz(int input) {
        if(fizzBuzzRule.isRule(input)) return fizzBuzzRule.getResult();
        if(fizzRule.isRule(input)) return fizzRule.getResult();
        if(buzzRule.isRule(input)) return buzzRule.getResult();
        return Integer.toString(input);
    }
}