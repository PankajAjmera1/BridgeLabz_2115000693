import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Manager Employee ID: " + employeeID);
        System.out.println("Manager Department: " + department);
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Employee
        System.out.print("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(employeeID, department, salary);
        employee.displayDetails();

        // Update Salary
        System.out.print("\nEnter Updated Salary: ");
        double updatedSalary = scanner.nextDouble();
        employee.setSalary(updatedSalary);
        System.out.println("Updated Salary: " + employee.getSalary());

        // Taking input for Manager
        scanner.nextLine(); 
        System.out.print("\nEnter Manager Employee ID: ");
        int managerID = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Manager Department: ");
        String managerDepartment = scanner.nextLine();

        System.out.print("Enter Manager Salary: ");
        double managerSalary = scanner.nextDouble();

        Manager manager = new Manager(managerID, managerDepartment, managerSalary);
        manager.displayManagerDetails();

        scanner.close();
    }
}
