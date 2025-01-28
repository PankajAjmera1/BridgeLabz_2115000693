import java.util.Scanner;
public class Handshakes2 {
    public static int calculateHandshakes(int numberOfStudents) {
        if (numberOfStudents < 2) {
            return 0; 
        }
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input 
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
   }
}

