package org.example;

import java.util.concurrent.Callable;

public class CallableThread extends Thread implements Callable<Employee> {
    @Override
    public Employee call() throws Exception {
        Employee employee = new Employee(1, "Michael");
        return employee;
    }
}
