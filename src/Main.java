import com.lazzy.Employee;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Cheikh", "frontend developper");
        Employee employee2 = new Employee("Daouda", "backend developper");
        Employee employee3 = new Employee("Mamadou", "pentester");

        System.out.println(employee1 + " : "+ employee1.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee2 + " : "+ employee2.pay());
        System.out.println("-----------------------\n");
        System.out.println(employee3 + " : "+ employee3.pay());
    }

}
