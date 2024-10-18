package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hi Michael. This is your thread: " + Thread.currentThread().getId()));
        thread.start();
        System.out.println("Main: " + Thread.currentThread().getId());

        CustomThread ct = new CustomThread();
        ct.start();
    }
}