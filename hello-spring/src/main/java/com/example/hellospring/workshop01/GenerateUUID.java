package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID {
    private int random;
    public int getRandomNum() {
        return random;
    }

    public String get(String name) {
        String id = "";
        Random random = new Random();
        int randomNum = random.nextInt(10);
        this.random = randomNum;
        id = "XYZ" + name + randomNum;
        return id;
    }
}
