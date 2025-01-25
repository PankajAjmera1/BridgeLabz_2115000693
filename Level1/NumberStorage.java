import java.util.Scanner;

public class NumberStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            System.out.println("Enter a number (0 or negative to stop):");
            double input = scanner.nextDouble();

            // Break the loop if the input is 0 or negative
            if (input <= 0) {
                break;
            }
            numbers[index] = input;
            index++;

            // Break loop if arr is full
            if (index == 10) {
                break;
            }
        }

        // Calculate the total of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

       //print
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total sum of numbers: " + total);

        scanner.close();
    }
}
