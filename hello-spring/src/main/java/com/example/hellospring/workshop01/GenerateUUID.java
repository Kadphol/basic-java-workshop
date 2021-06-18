package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID {
    private Random random;
    public void setRandom(Random random) {
        this.random = random;
    }

    public String get(String name) {
        String id = "";
        int randomNum = random.nextInt(10);
        id = "XYZ" + name + randomNum;
        return id;
    }
}
