abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into " + holderName + "'s account. New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from " + holderName + "'s account. Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds in " + holderName + "'s account.");
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("------------------------------------------------");
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + (this instanceof SavingsAccount ? "Savings Account" : "Current Account"));
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Earned: $" + calculateInterest());
        System.out.println("------------------------------------------------");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate = 0.05; // 5% interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }
}

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA123", "Sachin Tendulkar", 1000);
        BankAccount currentAccount = new CurrentAccount("CA456", "Virat Kohli", 500);

        savingsAccount.displayAccountDetails();
        currentAccount.displayAccountDetails();

        
        savingsAccount.deposit(500);
        savingsAccount.withdraw(300);

        currentAccount.deposit(200);
        currentAccount.withdraw(700);
    }
}
