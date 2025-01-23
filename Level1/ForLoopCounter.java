import java.util.Scanner;

public class ForLoopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter counter number: ");
        int counter = scanner.nextInt();
        
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Booming Using For!");
        
        scanner.close();
    }
}