import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();
        int result;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("The result of " + first + " " + op + " " + second + " is " + result);
    }
}