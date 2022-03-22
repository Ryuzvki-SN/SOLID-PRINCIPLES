package factory;

import com.lazzy.Employee;
import com.typeEmployee.BackendDevelopper;
import com.typeEmployee.FrontendDevelopper;
import com.typeEmployee.Pentester;

public class EmployeeFactory implements IEmployeeFactory {
    @Override
    public Employee createEmployee(String empType) {
        if (empType == null || empType.isEmpty())
            return null;
        switch (empType) {
            case "Pentester":
                return new Pentester();
            case "BackendDevelopper":
                return new BackendDevelopper();
            case "FrontendDevelopper":
                return new FrontendDevelopper();
        }

        return null;
    }
}
