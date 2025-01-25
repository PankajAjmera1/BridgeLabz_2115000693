import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        String[] remarks = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            
            System.out.print("Physics: ");
            physicsMarks[i] = input.nextInt();
            if (physicsMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                i--;
                continue;
            }

            System.out.print("Chemistry: ");
            chemistryMarks[i] = input.nextInt();
            if (chemistryMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            mathsMarks[i] = input.nextInt();
            if (mathsMarks[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                i--;
                continue;
            }

            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
                remarks[i] = "Level 1, too below agency-normalized standards";
            } else {
                grades[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("  Physics: " + physicsMarks[i]);
            System.out.println("  Chemistry: " + chemistryMarks[i]);
            System.out.println("  Maths: " + mathsMarks[i]);
            System.out.println("  Percentage: " + percentages[i] + "%");
            System.out.println("  Grade: " + grades[i]);
            System.out.println("  Remarks: " + remarks[i]);
        }

        input.close();
    }
}