import com.lazzy.App;
import com.lazzy.Employee;
import factory.IEmployeeFactory;
import factory.EmployeeFactory;
import strategy.AbstractEmployeeType;
import strategy.BackendType;
import strategy.FrontendType;
import strategy.PentesterType;

public class Main {

    public static void main(String[] args) {
        //create Employee
        IEmployeeFactory iEmployeeFactory = new EmployeeFactory();
        AbstractEmployeeType backend = new BackendType();
        AbstractEmployeeType frontend = new FrontendType();
        AbstractEmployeeType pentester = new PentesterType();
        //Job
        Employee job1 = iEmployeeFactory.createEmployee(backend);
        Employee job2 = iEmployeeFactory.createEmployee(frontend);
        Employee job3 = iEmployeeFactory.createEmployee(pentester);
        // Employee and his job
        App employee1 = new App("Cheikh", job1);
        App employee2 = new App("Daouda", job2);
        App employee3 = new App("Mamadou", job3);
        //pay employee
        System.out.println("-----------------------\n");
        System.out.println(employee1 + " : " + employee1.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee2 + " : "+ employee2.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee3 + " : "+ employee3.pay());
    }

}
