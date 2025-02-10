abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee {
    private int workHours;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, int workHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * 20); // Example hourly rate
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

public class EmployeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee(1, "Sachin Tendulkar", 5000, 10);
        employees[1] = new PartTimeEmployee(2, "Virat Kohli", 3000);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }
}
