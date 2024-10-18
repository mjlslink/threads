package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1: 0.06038067927329582 at Thread: 22
 * 2: 0.07333896041662713 at Thread: 22
 * 3: 0.1539571875644027 at Thread: 22
 * 4: 0.40392275120300525 at Thread: 22
 */

public class SingleExecutrorExmaple {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
/*
        executorService.execute(() -> System.out.println("1: " + Math.random() + " at Thread: " +Thread.currentThread().getId()));
        executorService.execute(() -> System.out.println("2: " + Math.random() + " at Thread: " +Thread.currentThread().getId()));
        executorService.execute(() -> System.out.println("3: " + Math.random() + " at Thread: " +Thread.currentThread().getId()));
        executorService.execute(() -> System.out.println("4: " + Math.random() + " at Thread: " +Thread.currentThread().getId()));
*/
        List<Callable<Double>> callables = new ArrayList<>();

        callables.add(() -> Math.random());
        callables.add(() -> Math.random());
        callables.add(() -> Math.random());
        callables.add(() -> Math.random());

        try {
            Thread.sleep(10);
            System.out.println(executorService.invokeAll(callables));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
