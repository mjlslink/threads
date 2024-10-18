package org.example;

import java.util.concurrent.Callable;
import java.util.Random;

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        Thread.sleep(randomNumber * 1000); // Simulate some delay
        return randomNumber;
    }
}