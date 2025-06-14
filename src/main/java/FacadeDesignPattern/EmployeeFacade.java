package FacadeDesignPattern;

public class EmployeeFacade {

    EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        employeeDAO.insertEmployeeRecord();
    }

    public void update() {
        employeeDAO.updateEmployeeRecord();
    }

    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    public Employee getEmployeeByName(String name) {
        return employeeDAO.getEmployeeByName(name);
    }
}