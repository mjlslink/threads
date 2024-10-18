package org.example;

import java.util.concurrent.FutureTask;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        // Create a FutureTask to wrap the Callable
        FutureTask<Integer> futureTask = new FutureTask<>(new MyCallable());

        // Create a Thread with the FutureTask
        Thread thread = new Thread(futureTask);
        thread.start();

        // Get the result from the FutureTask
        Integer result = futureTask.get();
        System.out.println("Random number generated: " + result);
    }
}