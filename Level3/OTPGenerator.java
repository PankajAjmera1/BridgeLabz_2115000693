public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // Ensures 6-digit OTP
    }

    // checking method OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Found a duplicate
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTPs

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();

        // Validate uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
