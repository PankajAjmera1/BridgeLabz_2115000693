class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentRecordManagement {
    private Student head;

    public StudentRecordManagement() {
        this.head = null;
    }

    // Add a new student at the beginning
    public void addStudentAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
        System.out.println("Student added at the beginning.");
    }

    // Add a new student at the end
    public void addStudentAtEnd(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
        System.out.println("Student added at the end.");
    }

    // Add a student at a specific position (1-based index)
    public void addStudentAtPosition(int rollNumber, String name, int age, char grade, int position) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            System.out.println("Student added at position " + position);
            return;
        }

        Student temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }

        newStudent.next = temp.next;
        temp.next = newStudent;
        System.out.println("Student added at position " + position);
    }

    // Delete a student by Roll Number
    public void deleteStudent(int rollNumber) {
        if (head == null) {
            System.out.println("No records available.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student record deleted.");
            return;
        }

        Student temp = head, prev = null;
        while (temp != null && temp.rollNumber != rollNumber) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Student not found.");
            return;
        }

        prev.next = temp.next;
        System.out.println("Student record deleted.");
    }

    // Search for a student by Roll Number
    public void searchStudent(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll No: " + temp.rollNumber + ", Name: " + temp.name +
                        ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update a student's grade
    public void updateGrade(int rollNumber, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Student grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all student records
    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

// Main class for testing
public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentRecordManagement system = new StudentRecordManagement();

        system.addStudentAtBeginning(101, "Rahul", 18, 'A');
        system.addStudentAtEnd(102, "Ananya", 19, 'B');
        system.addStudentAtPosition(103, "Vikram", 20, 'A', 2);

        system.displayStudents();

        System.out.println("Searching for Roll No 102:");
        system.searchStudent(102);

        system.updateGrade(103, 'A');

        system.deleteStudent(101);
        system.displayStudents();
    }
}
