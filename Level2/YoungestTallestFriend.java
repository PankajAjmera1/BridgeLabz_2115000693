import java.util.Scanner;
public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of Amar: ");
        int age1 = scanner.nextInt();
        System.out.println("Enter the height of Amar: ");
        int height1 = scanner.nextInt();
        System.out.println("Enter the age of Akbar: ");
        int age2 = scanner.nextInt();
        System.out.println("Enter the height of Akbar: ");
        int height2 = scanner.nextInt();
        System.out.println("Enter the age of Anthony: ");
        int age3 = scanner.nextInt();
        System.out.println("Enter the height of Anthony: ");
        int height3 = scanner.nextInt();
        int youngestAge = Math.min(age1, Math.min(age2, age3));
        String youngestFriend = "";
        if (youngestAge == age1) {
            youngestFriend = "Amar";
        } else if (youngestAge == age2) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        int tallestHeight = Math.max(height1, Math.max(height2, height3));
        String tallestFriend = "";
        if (tallestHeight == height1) {
            tallestFriend = "Amar";
        } else if (tallestHeight == height2) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        System.out.println("The youngest friend is " + youngestFriend);
        System.out.println("The tallest friend is " + tallestFriend);
    }
}