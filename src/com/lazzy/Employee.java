package com.lazzy;

import java.util.Objects;

public class Employee {
    private final String name;
    private final String task;

    /**
     * Constructor class Animal.
     *
     * @param name   represents the name of an Employee
     * @param task   represents the task
     */
    public Employee(String name, String task) {
        this.name = name;
        this.task = task;
    }

    /**
     * @implNote This method break the SRP clause that
     * must be verified by a class
     */

    public String pay() {
        if (Objects.equals(task, "pentester")) {
            return "$75000.00";
        } else if (Objects.equals(task, "frontend developper")) {
            return "$65000.00";
        } else if (Objects.equals(task, "backend developper")) {
            return "$70000.00";
        } else {
            return "[!] task non répertorié ! ";
        }
    }

    public String toString() {
        return "Employee{" +
                "name:'" + this.name + '\'' +
                ", task:'" + this.task + '\'' +
                '}';
    }
}