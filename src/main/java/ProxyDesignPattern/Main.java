package ProxyDesignPattern;

public class Main {
    public static void main(String[] args){
        try{

            EmployeeDAO employeeDAO1 = new EmployeeDAOProxy();
            employeeDAO1.create("ADMIN", new Employee());
            employeeDAO1.get("ADMIN", 2);

            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.create("USER", new Employee());
            employeeDAO.get("USER", 3);

            System.out.println("Operation Successful!!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
