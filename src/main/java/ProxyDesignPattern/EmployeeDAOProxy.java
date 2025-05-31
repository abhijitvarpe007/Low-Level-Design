package ProxyDesignPattern;

public class EmployeeDAOProxy implements EmployeeDAO{

    EmployeeDAO employeeDAO;

    EmployeeDAOProxy(){
        employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAO.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDAO.delete(client, empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            employeeDAO.get(client, empId);
            return new Employee();
        }
        throw new Exception("Access Denied");
    }
}
