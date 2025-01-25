import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (in kg)  " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (in cm)  " + (i + 1) + ": ");
            heights[i] = input.nextDouble();

            double heightInMeters = heights[i] / 100;
            bmis[i] = weights[i] / (heightInMeters * heightInMeters);

            if (bmis[i] < 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] < 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        System.out.println("\nBMI Results:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Height: " + heights[i] + " cm");
            System.out.println("  Weight: " + weights[i] + " kg");
            System.out.println("  BMI: " + bmis[i]);
            System.out.println("  Status: " + statuses[i]);
            System.out.println();
        }

        input.close();
    }
}