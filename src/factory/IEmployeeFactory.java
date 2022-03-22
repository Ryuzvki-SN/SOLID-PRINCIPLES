package factory;

import com.lazzy.Employee;
import strategy.AbstractEmployeeType;

public interface IEmployeeFactory {
    Employee createEmployee(AbstractEmployeeType type);
}
