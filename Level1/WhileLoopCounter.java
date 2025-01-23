import java.util.Scanner;

public class WhileLoopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter countdow  number: ");
        int counter = scanner.nextInt();
        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Boom..... Launched !");
        
        scanner.close();
    }
}