import java.util.Scanner;
public class NaturalNumberSum {
  
   public static int sumOfNaturalNumbersRecursive(int n) {
      if (n == 1) {
         return 1;
      }
      return n + sumOfNaturalNumbersRecursive(n - 1);
   }
   public static int sumOfNaturalNumbersFormula(int n) {
      return n * (n + 1) / 2;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a natural number: ");
      int n = sc.nextInt();
      if (n <= 0) {
         System.out.println("Invalid input, Please enter a natural number.");
         return;
      }
      int recursiveSum = sumOfNaturalNumbersRecursive(n);
      int formulaSum = sumOfNaturalNumbersFormula(n);
      System.out.println("Sum using recursion: " + recursiveSum);
      System.out.println("Sum using formula: " + formulaSum);
      System.out.println("Checking Both Results " + (recursiveSum == formulaSum ? "equal" : "not equal"));
   }
}
