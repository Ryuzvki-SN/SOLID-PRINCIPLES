package com.lazzy;

public class Employee {
    private final String name;
    private final String task;

    private final Ipay payEmployee;

    /**
     * Constructor class Animal.
     *
     * @param name   represents the name of an Employee
     * @param task   represents the task
     */
    public Employee(String name, String task) {
        this.name = name;
        this.task = task;
        this.payEmployee = new Pay();
    }

    /**
     * Depend on abstractions,
     * not on concretions.
     * @implNote This method checks DIP clause that
     * must be applied by a class
     */

    public String pay() {
        return payEmployee.payEmployee(this.task);
    } //Delegation

    public String toString() {
        return "Employee{" +
                "name:'" + this.name + '\'' +
                ", task:'" + this.task + '\'' +
                '}';
    }
}