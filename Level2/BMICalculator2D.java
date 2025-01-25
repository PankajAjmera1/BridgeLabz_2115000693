import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[][] data = new double[numPersons][3];
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter the height (in cm)  " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.println("Enter the weight (in kg)  " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);
        }
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + data[i][0] + " cm");
            System.out.println("Weight: " + data[i][1] + " kg");
            System.out.println("BMI: " + data[i][2]);
            String weightStatus;
            if (data[i][2] < 18.4) {
                weightStatus = "Underweight";
            } else if (data[i][2] < 24.9) {
                weightStatus = "Normal weight";
            } else if (data[i][2] < 39.9) {
                weightStatus = "Overweight";
            } else {
                weightStatus = "Obese";
            }
            System.out.println("Weight status: " + weightStatus);
            System.out.println();
        }
    }
}