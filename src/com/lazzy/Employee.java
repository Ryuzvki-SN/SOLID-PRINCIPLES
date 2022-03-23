package com.lazzy;

import service.Ipay;

public class Employee {
    private final String name;
    private final String task;

    private final Ipay payEmployee;

    /**
     * Constructor class Employee.
     *
     * @param name represents the name of an Employee
     * @param task represents the task
     * @param pay  represents the dependency injection
     */
    public Employee(String name, String task, Ipay pay) {
        this.name = name;
        this.task = task;
        this.payEmployee = pay;//Injection de dependence
    }

    /**
     * Make fine grained interfaces that
     * are client specific
     *
     * @implNote This method checks ISP clause that
     * must be applied by a class
     */

    public String pay() {
        return payEmployee.pay(this.task);
    } //Delegation

    public String toString() {
        return "Employee{" +
                "name:'" + this.name + '\'' +
                ", task:'" + this.task + '\'' +
                '}';
    }
}