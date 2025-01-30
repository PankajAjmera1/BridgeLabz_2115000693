import java.util.Scanner;

public class SubstringOccurrences {
    // Method to count occurrences of a substring in a string
    
    public static int countSubstringOccurrences(String str, String subStr) {
        int count = 0;
        int strLen = str.length();
        int subLen = subStr.length();

        for (int i = 0; i <= strLen - subLen; i++) {
            boolean found = true;
            for (int j = 0; j < subLen; j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String str = sc.nextLine();
        System.out.println("Enter the substring:");
        String subStr = sc.nextLine();
        sc.close();

        int count = countSubstringOccurrences(str, subStr);
        System.out.println("Occurrences of '" + subStr + "': " + count);
    }
}
