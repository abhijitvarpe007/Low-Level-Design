package ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("Create new row in the Employee table");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        System.out.println("Deleted row with employeeID : " + empId);
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        System.out.println("Fetching data from the DB");
        return new Employee();
    }
}
