package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CachedThreadPoolExamlpe {

    private static ExecutorService executorService = Executors.newCachedThreadPool();

    private static Future<Double> getRandom(int i) {
        return executorService.submit(() -> {
            Thread.sleep(200);
            System.out.println("value:" + Thread.currentThread().getId());
            return Math.random();
        });
    }

    public static void main(String[] args) {
        for (int i=0; i < 100; i++ ) {
            getRandom(i);
        }
        executorService.shutdown();
    }}
