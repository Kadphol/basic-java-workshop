package com.example.hellospring.workshop01;

public class FizzBuzz {
    private Rule[] rules;

    public FizzBuzz() {
        rules = new Rule[] {
                new FizzBuzzRule(),
                new FizzRule(),
                new BuzzRule(),
        };
    }

    public String getFizzBuzz(int input) {
        for(Rule rule : rules) {
            if(rule.isRule(input)) {
                return rule.getResult();
            }
        }
        return Integer.toString(input);
    }
}