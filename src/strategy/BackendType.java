package strategy;

import com.lazzy.Employee;
import com.typeEmployee.BackendDevelopper;

public class BackendType extends AbstractEmployeeType {
    @Override
    public Employee create() {
        return new BackendDevelopper();
    }
}
