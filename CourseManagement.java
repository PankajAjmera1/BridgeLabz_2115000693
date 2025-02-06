import java.util.ArrayList;

// Student class (Association: Many-to-Many with Course)
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Ensure bidirectional relationship
        }
    }

    public void showCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        if (courses.isEmpty()) {
            System.out.println("  No courses enrolled.");
        } else {
            for (Course course : courses) {
                System.out.println("  - " + course.getName());
            }
        }
    }
}

// Course class (Association: Many-to-Many with Student)
class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("\nStudents enrolled in " + name + " course:");
        if (students.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("  - " + student.getName());
            }
        }
    }
}

// School class (Aggregation: Owns Students, but students can exist independently)
class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("\nStudents in " + name + ":");
        if (students.isEmpty()) {
            System.out.println("  No students available.");
        } else {
            for (Student student : students) {
                System.out.println("  - " + student.getName());
            }
        }
    }
}

// Main class
public class CourseManagement {
    public static void main(String[] args) {
        // Creating a School
        School school = new School("GLA University");

        // Creating Students
        Student student1 = new Student("Pankaj");
        Student student2 = new Student("Krish");
        Student student3 = new Student("Ajay");

        // Creating Courses
        Course math = new Course("Math");
        Course science = new Course("Science");

        // Students enrolling in courses
        student1.enrollCourse(math);
        student1.enrollCourse(science);
        student2.enrollCourse(math);
        student3.enrollCourse(science);

        // Adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Displaying student enrollments
        student1.showCourses();
        student2.showCourses();
        student3.showCourses();

        // Displaying students enrolled in each course
        math.showStudents();
        science.showStudents();

        // Displaying all students in the school
        school.showAllStudents();
    }
}
