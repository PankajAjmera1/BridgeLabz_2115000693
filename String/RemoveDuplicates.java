import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicateChars(String str) {
        boolean[] seen = new boolean[256]; // ASCII characters
        String result = "";

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
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

        String result = removeDuplicateChars(input);
        System.out.println("String after removing duplicates: " + result);
    }
}
