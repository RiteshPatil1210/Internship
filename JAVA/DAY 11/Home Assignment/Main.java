class BankAccount {
    String accountHolderName = "Ritesh Patil";
    String accountNumber = "SB123456789";
    double balance = 25000.75;

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 4.5;

    void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.displayAccountDetails();
        acc.displayInterestRate();
    }
}
