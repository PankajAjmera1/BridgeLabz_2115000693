public class MaxHandshakes {
    public static void main(String[] args) {
        int numStudents = 10; 
        int maxHandshakes = calculateMaxHandshakes(numStudents);
        System.out.println("Maximum number of handshakes: " + maxHandshakes);
    }
    public static int calculateMaxHandshakes(int numStudents) {
        return (numStudents * (numStudents - 1)) / 2;
    }
}