import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in cm: ");
        double height = input.nextDouble();
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        String weightStatus;
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi < 24.9) {
            weightStatus = "Normal";
        } else if (bmi < 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }
        System.out.printf("Your BMI is %.2f and your weight status is %s\n", bmi, weightStatus);
    }
}