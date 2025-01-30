import java.util.Scanner;

public class RemoveCharacter {
   

    public static String removeCharacter(String str, char charToRemove) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != charToRemove) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter the character to remove:");
        char charToRemove = sc.nextLine().charAt(0);
        sc.close();

        String modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + modifiedStr);
    }
}
