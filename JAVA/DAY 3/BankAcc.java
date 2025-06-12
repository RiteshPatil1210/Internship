package Demo15;

public class BankAccount {
    
    int accountNumber;
    String accountHolder;
    double balance;

   
    public BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

   
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1234, "Sai", 5000);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.display();
    }
}
