import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isDivisibleBy5 = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleBy5);
    }
}