package FacadeDesignPattern;

public class EmployeeDAO {

    public void insertEmployeeRecord() {
        System.out.println("Employee Record inserted successfully...");
    }

    public void updateEmployeeRecord() {
        System.out.println("Record updated successfully ...");
    }

    public Employee getEmployeeById(int id) {
        Employee emp = new Employee();
        emp.setId(id);
        emp.setName("John Doe");
        emp.setEmailId("john.doe@example.com");
        return emp;
    }

    public Employee getEmployeeByName(String name) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName(name);
        emp.setEmailId(name.toLowerCase() + "@example.com");
        return emp;
    }
}