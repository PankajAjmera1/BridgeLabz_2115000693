import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        System.out.println("\nPostgraduate Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + getCGPA());

    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double CGPA = scanner.nextDouble();

        Student student = new Student(rollNumber, name, CGPA);
        student.displayDetails();

        // Update CGPA
        System.out.print("\nEnter updated CGPA: ");
        double updatedCGPA = scanner.nextDouble();
        student.setCGPA(updatedCGPA);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Taking input for Postgraduate Student
        scanner.nextLine();  
        System.out.print("\nEnter Postgraduate Student's Roll Number: ");
        int pgRollNumber = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Postgraduate Student's Name: ");
        String pgName = scanner.nextLine();

        System.out.print("Enter Postgraduate Student's CGPA: ");
        double pgCGPA = scanner.nextDouble();

        PostgraduateStudent pgStudent = new PostgraduateStudent(pgRollNumber, pgName, pgCGPA);
        pgStudent.displayPostgraduateDetails();

        scanner.close();
    }
}
