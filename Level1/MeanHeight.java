import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] heights = new int[11];
        System.out.println("Enter the heights of 11 players: ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt();
        }
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        double mean = (double) sum / heights.length;
        System.out.println("Mean height of the team: " + mean);
    }
}