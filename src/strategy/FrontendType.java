package strategy;

import com.lazzy.Employee;
import com.typeEmployee.FrontendDevelopper;

public class FrontendType extends AbstractEmployeeType {
    @Override
    public Employee create() {
        return new FrontendDevelopper();
    }
}
