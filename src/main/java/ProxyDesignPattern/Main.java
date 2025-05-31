package ProxyDesignPattern;

public class Main {
    public static void main(String[] args){
        try{
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.create("USER", new Employee());
            //employeeDAO.create("ADMIN", new Employee());
            employeeDAO.get("USER", 3);
            System.out.println("Operation Successful!!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
