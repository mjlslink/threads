package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CountWithRentrantLock {

    private static int counter = 0;
    private static Lock lock = new ReentrantLock();

    private static void increment() {

/*
        System.out.println(lock.tryLock());
        if (lock.tryLock()) {
*/
        try {
            lock.lock();
            int current = counter;
            System.out.println("Before: " + counter + " Current thread is " + Thread.currentThread().getId());
            counter = current + 1;
            System.out.println("After: " + counter + " Current thread is " + Thread.currentThread().getId());
        } finally {
            lock.unlock();
        }
//        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> increment());
            t.start();
        }
    }
}
