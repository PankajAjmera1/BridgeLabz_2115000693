import java.util.Scanner;

public class MostFrequentCharacter {
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; 

        for (char ch : str.toCharArray()) {
            freq[ch]++; 
        }

        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;

        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequentChar = ch;
            }
        }
        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        char mostFrequent = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
