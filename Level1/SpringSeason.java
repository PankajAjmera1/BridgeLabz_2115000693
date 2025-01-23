public class SpringSeason {
    public static void main(String[] args) {
        // checkin input arguments
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day");
            System.out.println("Example TO Run this---> java SpringSeason 4 15");
            return;
        }

        // Parse command-line argument
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpringMonth = 
            (month == 3 && day >= 20) ||  // March 20 onwards
            (month == 4 || month == 5) || // All of April and May
            (month == 6 && day <= 20);    // Until June 20

        if (isSpringMonth) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}