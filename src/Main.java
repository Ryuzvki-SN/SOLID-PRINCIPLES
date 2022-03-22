import com.lazzy.Employee;
import service.Ipay;
import service.Pay;

public class Main {

    public static void main(String[] args) {
        Ipay ipay = new Pay();
        Employee employee1 = new Employee("Cheikh", "frontend developper", ipay);
        Employee employee2 = new Employee("Daouda", "backend developper", ipay);
        Employee employee3 = new Employee("Mamadou", "pentester", ipay);

        System.out.println(employee1 + " : "+ employee1.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee2 + " : "+ employee2.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee3 + " : "+ employee3.pay());
    }

}
