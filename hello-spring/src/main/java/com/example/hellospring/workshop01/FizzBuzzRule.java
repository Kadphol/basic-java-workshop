package com.example.hellospring.workshop01;

public class FizzBuzzRule implements Rule {
    private FizzRule fizzRule;
    private BuzzRule buzzRule;
    public FizzBuzzRule() {
        fizzRule = new FizzRule();
        buzzRule = new BuzzRule();
    }
    @Override
    public boolean isRule(int input) {
        return fizzRule.isRule(input) && buzzRule.isRule(input);
    }

    @Override
    public String getResult() {
        return fizzRule.getResult()+buzzRule.getResult();
    }
}
