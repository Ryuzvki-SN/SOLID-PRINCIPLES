package com.lazzy;

public class App {
    private final String name;

    private final Employee employee;

    /**
     * Constructor class App.
     *
     * @param name represents the name of an Employee
     * @param employee  represents the dependency injection
     * @param employeeFactory  represents the dependency injection for EmployeeFactory
     */
    public App(String name, Employee employee) {
        this.name = name;
        this.employee = employee;//Injection de dependence
    }

    /**
     * Derived classes must be
     * substitutable for their base classes.
     *
     * @implNote This method checks LSP clause that
     * must be applied by a class
     */

    public String pay() {
        return employee.pay();
    } //Delegation

    public String toString() {
        return "Employee{" + "Name:'" + this.name + '\'' + '}';
    }
}