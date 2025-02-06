import java.util.ArrayList;

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account account : accounts) {
            System.out.println(account.getBalance());
        }
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer, Account account) {
        customer.openAccount(account);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Bank bank = new Bank("Ajmera Bank");

        Customer customer1 = new Customer("Pankaj");
        Account account1 = new Account("12345", 44000);
        bank.openAccount(customer1, account1);

        Customer customer2 = new Customer("Krish");
        Account account2 = new Account("67890", 20000);
        bank.openAccount(customer2, account2);

        System.out.println("Pankaj Balance:");
        customer1.viewBalance();
        System.out.println("Krish Balance:");
        customer2.viewBalance();
    }
}
