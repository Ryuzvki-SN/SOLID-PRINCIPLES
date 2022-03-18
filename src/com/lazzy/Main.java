package com.lazzy;

import factory.EmployeeFactory;

public class Main {

    public static void main(String[] args) {
        //create Employee
        IEmployeeFactory iEmployeeFactory = new EmployeeFactory();
        Employee emp1 = iEmployeeFactory.createEmployee("BackendDevelopper");
        Employee emp2 = iEmployeeFactory.createEmployee("FrontendDevelopper");
        Employee emp3 = iEmployeeFactory.createEmployee("Pentester");
        //
        App employee1 = new App("Cheikh", emp1);
        App employee2 = new App("Daouda", emp2);
        App employee3 = new App("Mamadou", emp3);
        //sout
        System.out.println(employee1 + " : "+ employee1.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee2 + " : "+ employee2.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee3 + " : "+ employee3.pay());
    }

}
