package ProxyDesignPattern;

public interface EmployeeDAO {

    public void create(String client, Employee employee) throws Exception;
    public void delete(String client, int empId) throws Exception;
    public Employee get(String client, int empId) throws Exception;
}
