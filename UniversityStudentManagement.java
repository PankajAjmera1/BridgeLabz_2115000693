import java.util.ArrayList;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        course.setProfessor(this);
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showDetails() {
        System.out.println("Course: " + name);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");

        Professor professor = new Professor("Dr.Ajmera");
        professor.assignCourse(course);

        Student student1 = new Student("Pankaj");
        student1.enrollCourse(course);

        Student student2 = new Student("Krish");
        student2.enrollCourse(course);

        course.showDetails();
    }
}
