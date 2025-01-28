import java.util.Scanner;

public class ChocolateDivider {

    public static void divideChocolates(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among 0 children.");
            return;
        }

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("Each child will get " + chocolatesPerChild + " chocolates.");
        System.out.println("Remaining chocolates: " + remainingChocolates);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        divideChocolates(numberOfChocolates, numberOfChildren);
    }
}
