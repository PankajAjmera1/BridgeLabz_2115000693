class BankAccount {
    private static String bankName = "Bank of India";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(
            "Pankaj Ajmera", 
            123456789);
        BankAccount acc2 = new BankAccount(
            "Krish", 
            12456669);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
