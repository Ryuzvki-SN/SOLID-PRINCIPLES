package com.lazzy;

public class App {
    private final String name;

    private final Employee employee;

    /**
     * Constructor class App.
     *
     * @param name represents the name of an Employee
     * @param employee  represents the dependency injection
     */
    public App(String name, Employee employee) {
        this.name = name;
        this.employee = employee;//Injection de dependence
    }

    /**
     * You should be able to extend a classes behavior,
     * without modifying it
     *
     * @implNote This method checks OCP clause that
     * must be applied by a class
     */

    public String pay() {
        return employee.pay();
    } //Delegation

    public String toString() {
        return this.name ;
    }
}