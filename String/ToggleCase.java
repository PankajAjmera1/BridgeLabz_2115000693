import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String toggled = toggleCase(input);
        System.out.println("Toggled case: " + toggled);
    }
}
