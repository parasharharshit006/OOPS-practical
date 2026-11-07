//practical 10
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
            System.out.println("Initial balance cannot be negative. Set to $0.0.");
        }
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit Failed: Amount must be greater than zero. Rejected value: $" + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal Failed: Amount must be greater than zero. Requested: $" + amount);
        } else if (amount > balance) {
            System.out.println("Withdrawal Failed: Insufficient funds. Requested: $" + amount + ", Available Balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("-----------------------------------");
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice Smith", "ACC-98765", 500.00);
        
        System.out.println("=== Initial Account Details ===");
        myAccount.displayAccountDetails();
        System.out.println("=== Testing Valid Transactions ===");
        myAccount.deposit(200.50);    
        myAccount.withdraw(150.00);   
        myAccount.displayAccountDetails();
        System.out.println("=== Testing Invalid Transactions (Encapsulation Protection) ===");
        myAccount.deposit(-50.00);
        myAccount.withdraw(0.00);
        myAccount.withdraw(2000.00);
        System.out.println("\n=== Final Account State ===");
        myAccount.displayAccountDetails();
    }
}