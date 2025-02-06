import java.util.ArrayList;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public String getDepartmentName() {  // Getter method added
        return departmentName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showDepartments() {
        for (Department department : departments) {
            System.out.println(department.getDepartmentName()); // Using getter method
            department.showEmployees();
        }
    }
}

public class CompanyManagement {
    public static void main(String[] args) {
        Company company = new Company("Ajmera Pvt. Ltd.");

        Department department1 = new Department("IT");
        department1.addEmployee(new Employee("Pankaj"));
        department1.addEmployee(new Employee("Krish"));

        Department department2 = new Department("HR");
        department2.addEmployee(new Employee("John"));
        department2.addEmployee(new Employee("Sophia"));

        company.addDepartment(department1);
        company.addDepartment(department2);

        company.showDepartments();
    }
}
