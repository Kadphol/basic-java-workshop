package com.example.hellospring.workshop01;

public class KBTGRule implements Rule {
    @Override
    public boolean isRule(int input) {
        return input%7 == 0;
    }

    @Override
    public String getResult() {
        return "KBTG BASIC JAVA";
    }
}
