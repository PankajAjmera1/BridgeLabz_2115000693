import java.util.ArrayList;

// Faculty class (Aggregation: Faculty exists independently)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class (Composition: Departments belong to University)
class Department {
    private String departmentName;
    private ArrayList<Faculty> faculties;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.faculties = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showFaculties() {
        System.out.println("  Faculties in " + departmentName + " Department:");
        for (Faculty faculty : faculties) {
            System.out.println("    - " + faculty.getName());
        }
    }
}

// University class (Composition: Owns Departments)
class University {
    private String universityName;
    private ArrayList<Department> departments;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showDepartments() {
        System.out.println("\nDepartments in " + universityName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getDepartmentName());
            department.showFaculties();
        }
    }

    // Deleting University removes all Departments (Composition)
    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + universityName);
        departments.clear();
        System.out.println("All departments deleted.");
    }
}

// Main class to test functionality
public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("IIT Bombay");

        // Creating Departments (Composition)
        Department csDept = new Department("Computer Science");
        Department eeDept = new Department("Electrical Engineering");

        // Creating Faculty members (Aggregation)
        Faculty faculty1 = new Faculty("Dr. Ajmera");
        Faculty faculty2 = new Faculty("Dr. Krish");
        Faculty faculty3 = new Faculty("Dr. Sharma");

        // Assigning faculty to departments
        csDept.addFaculty(faculty1);
        csDept.addFaculty(faculty2);
        eeDept.addFaculty(faculty3);

        // Adding departments to the university
        university.addDepartment(csDept);
        university.addDepartment(eeDept);

        // Displaying university details
        university.showDepartments();

        // Deleting University (Composition Effect)
        university.deleteUniversity();

        // Faculty members still exist (Aggregation Effect)
        System.out.println("\nFaculty members still exist independently:");
        System.out.println("- " + faculty1.getName());
        System.out.println("- " + faculty2.getName());
        System.out.println("- " + faculty3.getName());
    }
}
