package q3;
import java.util.*;

class Account {
    private int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    protected int getAccountNumber() {
        return accountNumber;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or exceeding overdraft limit.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.remove(i);
                System.out.println("Account " + accountNumber + " closed.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void payDividend(double amount) {
        for (Account account : accounts) {
            account.deposit(amount);
        }
    }

    public void updateAccounts() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CurrentAccount) {
                if (account.getBalance() < 0) {
                    System.out.println("Sending overdraft letter for Account " + account.getAccountNumber());
                }
            }
        }
    }

    public void displayAllAccountsInfo() {
        for (Account account : accounts) {
            account.displayInfo();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Open Account");
            System.out.println("2. Close Account");
            System.out.println("3. Pay Dividend");
            System.out.println("4. Update Accounts");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose an account type:");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    int accountType = scanner.nextInt();
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();

                    if (accountType == 1) {
                        System.out.print("Enter interest rate: ");
                        double interestRate = scanner.nextDouble();
                        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, initialBalance, interestRate);
                        bank.openAccount(savingsAccount);
                        System.out.println("Savings Account opened.");
                    } else if (accountType == 2) {
                        System.out.print("Enter overdraft limit: ");
                        double overdraftLimit = scanner.nextDouble();
                        CurrentAccount currentAccount = new CurrentAccount(accountNumber, initialBalance, overdraftLimit);
                        bank.openAccount(currentAccount);
                        System.out.println("Current Account opened.");
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number to close: ");
                    int closeAccountNumber = scanner.nextInt();
                    bank.closeAccount(closeAccountNumber);
                    break;

                case 3:
                    System.out.print("Enter dividend amount: $");
                    double dividendAmount = scanner.nextDouble();
                    bank.payDividend(dividendAmount);
                    System.out.println("Dividend paid.");
                    break;

                case 4:
                    bank.updateAccounts();
                    System.out.println("Accounts updated.");
                    break;

                case 5:
                    System.out.println("All Account Information:");
                    bank.displayAllAccountsInfo();
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
