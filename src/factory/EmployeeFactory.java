package factory;

import com.lazzy.Employee;
import strategy.AbstractEmployeeType;

public class EmployeeFactory implements IEmployeeFactory {

    @Override
    public Employee createEmployee(AbstractEmployeeType type) {
        return type.create();
    }
}
