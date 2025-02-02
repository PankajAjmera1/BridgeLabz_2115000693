import java.util.Scanner;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("\nBank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Bank Account
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
        account.displayDetails();

        // Update Balance
        System.out.print("\nEnter Updated Balance: ");
        double updatedBalance = scanner.nextDouble();
        account.setBalance(updatedBalance);
        System.out.println("Updated Balance: " + account.getBalance());

        // Taking input for Savings Account
        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter Savings Account Number: ");
        String savingsAccountNumber = scanner.nextLine();

        System.out.print("Enter Savings Account Holder Name: ");
        String savingsAccountHolder = scanner.nextLine();

        System.out.print("Enter Savings Account Balance: ");
        double savingsBalance = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsAccountHolder, savingsBalance);
        savingsAccount.displaySavingsAccountDetails();

        scanner.close();
    }
}
