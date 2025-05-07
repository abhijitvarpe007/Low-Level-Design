package EmployeeHierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Enum for Supervision Types
enum SupervisionType {
    REG_MANAGER(1, "Regular Manager"),
    FUNC_MANAGER(2, "Functional Manager"),
    CO_FUNC_MANAGER(3, "Co-Functional Manager");

    private final int id;
    private final String name;

    SupervisionType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Get SupervisionType by ID
    public static SupervisionType fromId(int id) {
        for (SupervisionType type : SupervisionType.values()) {
            if (type.id == id) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid supervision type ID: " + id);
    }
}

// Employee class
class Employee {
    int empId;
    String name;
    String department;

    public Employee(int empId, String name, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

// Supervision class
class Supervision {
    int supervisorId;
    int superviseeId;
    SupervisionType supervisionType;

    public Supervision(int supervisorId, int superviseeId, SupervisionType supervisionType) {
        this.supervisorId = supervisorId;
        this.superviseeId = superviseeId;
        this.supervisionType = supervisionType;
    }
}

// Hierarchy Node (for structured output)
class HierarchyNode {
    Employee employee;
    List<HierarchyNode> subordinates;

    public HierarchyNode(Employee employee) {
        this.employee = employee;
        this.subordinates = new ArrayList<>();
    }
}

// Main class
public class EmployeeHierarchy {
    private Map<Integer, Employee> employeeMap = new HashMap<>();
    private List<Supervision> supervisions = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.empId, employee);
    }

    public void addSupervision(Supervision supervision) {
        supervisions.add(supervision);
    }

    // Get roll-down hierarchy for a supervision type ID
    public HierarchyNode getRollDownHierarchy(Employee employee, int typeId) {
        SupervisionType type = SupervisionType.fromId(typeId);
        return buildRollDown(employee, type);
    }

    private HierarchyNode buildRollDown(Employee employee, SupervisionType type) {
        HierarchyNode node = new HierarchyNode(employee);
        for (Supervision s : supervisions) {
            if (s.supervisorId == employee.empId && s.supervisionType == type) {
                Employee subordinate = employeeMap.get(s.superviseeId);
                node.subordinates.add(buildRollDown(subordinate, type));
            }
        }
        return node;
    }

    // Get roll-up hierarchy for a supervision type ID
    public List<Employee> getRollUpHierarchy(Employee employee, int typeId) {
        SupervisionType type = SupervisionType.fromId(typeId);
        return buildRollUp(employee, type);
    }

    private List<Employee> buildRollUp(Employee employee, SupervisionType type) {
        List<Employee> supervisors = new ArrayList<>();
        for (Supervision s : supervisions) {
            if (s.superviseeId == employee.empId && s.supervisionType == type) {
                Employee supervisor = employeeMap.get(s.supervisorId);
                supervisors.add(supervisor);
                supervisors.addAll(buildRollUp(supervisor, type));
            }
        }
        return supervisors;
    }

    // Populate sample data with mixed supervision types
    public void addSampleData() {
        // Employees
        addEmployee(new Employee(1, "Alice Smith", "HR"));
        addEmployee(new Employee(2, "Bob Johnson", "IT"));
        addEmployee(new Employee(3, "Carol White", "Finance"));
        addEmployee(new Employee(4, "David Brown", "Marketing"));
        addEmployee(new Employee(5, "Eva Green", "IT"));
        addEmployee(new Employee(6, "Frank Black", "HR"));
        addEmployee(new Employee(7, "Grace Blue", "Finance"));
        addEmployee(new Employee(8, "Henry Red", "Marketing"));
        addEmployee(new Employee(9, "Ivy Yellow", "IT"));
        addEmployee(new Employee(10, "Jack Gray", "HR"));

        // Supervisions (mixed types)
        addSupervision(new Supervision(1, 6, SupervisionType.REG_MANAGER));   // Alice -> Frank (Regular)
        addSupervision(new Supervision(1, 10, SupervisionType.REG_MANAGER));  // Alice -> Jack (Regular)
        addSupervision(new Supervision(1, 2, SupervisionType.REG_MANAGER));   // Alice -> Bob (Regular)
        addSupervision(new Supervision(2, 5, SupervisionType.REG_MANAGER));   // Bob -> Eva (Regular)
        addSupervision(new Supervision(2, 9, SupervisionType.REG_MANAGER));   // Bob -> Ivy (Regular)
        addSupervision(new Supervision(2, 3, SupervisionType.REG_MANAGER));  // Bob -> Carol (Functional)
        addSupervision(new Supervision(3, 7, SupervisionType.REG_MANAGER));   // Carol -> Grace (Regular)
        addSupervision(new Supervision(1, 4, SupervisionType.CO_FUNC_MANAGER)); // Alice -> David (Co-Functional)
        addSupervision(new Supervision(4, 8, SupervisionType.REG_MANAGER));    // David -> Henry (Regular)
    }

    public static void main(String[] args) {
        EmployeeHierarchy hierarchy = new EmployeeHierarchy();
        hierarchy.addSampleData();

        // Example 1: Roll-Down for Alice (typeId=1: Regular Manager)
        Employee alice = hierarchy.employeeMap.get(1);
        System.out.println("Roll-Down for Alice (Regular Manager):");
        HierarchyNode rollDown = hierarchy.getRollDownHierarchy(alice, 1);
        printHierarchy(rollDown, 0);

        // Example 2: Roll-Up for Grace (typeId=2: Functional Manager)
        Employee grace = hierarchy.employeeMap.get(7);
        System.out.println("\nRoll-Up for Grace (Functional Manager):");
        List<Employee> rollUp = hierarchy.getRollUpHierarchy(grace, 1);
        rollUp.forEach(System.out::println);
    }

    // Helper to print hierarchy tree
    private static void printHierarchy(HierarchyNode node, int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) indent.append("  ");
        System.out.println(indent + node.employee.toString());
        for (HierarchyNode subordinate : node.subordinates) {
            printHierarchy(subordinate, depth + 1);
        }
    }
}
