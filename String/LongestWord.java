import java.util.Scanner;

public class LongestWord {

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        sc.close();

        String longestWord = findLongestWord(sentence);
        System.out.println("Longest Word: " + longestWord);
    }
}
