package FacadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();

        facade.insert();
        facade.update();

        Employee emp1 = facade.getEmployeeById(1);
        System.out.println(emp1);

        Employee emp2 = facade.getEmployeeByName("Alice");
        System.out.println(emp2);
    }
}