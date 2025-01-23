import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();
        double bonusAmount;
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05;
        } else {
            bonusAmount = 0;
        }
        System.out.println("The bonus amount is: " + bonusAmount);
    }
}