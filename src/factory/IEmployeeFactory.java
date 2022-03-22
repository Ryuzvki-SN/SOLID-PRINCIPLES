package factory;

import com.lazzy.Employee;

public interface IEmployeeFactory {
    Employee createEmployee(String empType);
}
