import java.util.Scanner;

public class VowelConsonantCount {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int countVowels(String str) {
        int vowels = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' && isVowel(c)) {
                vowels++;
            }
        }
        return vowels;
    }

    public static int countConsonants(String str) {
        int consonants = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z' && !isVowel(c)) {
                consonants++;
            }
        }
        return consonants;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();

        int vowels = countVowels(str);
        int consonants = countConsonants(str);

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
