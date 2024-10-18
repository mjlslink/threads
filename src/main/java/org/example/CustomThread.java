package org.example;

public class CustomThread extends Thread{
    @Override
    public void run() {
        System.out.println("Custom thread");
    }
}
