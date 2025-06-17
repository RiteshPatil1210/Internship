class BankAccount {
    private int accn;
    private int bal;

    void set(int a, int b) {
        accn = a;
        bal = b;
    }

    void get() {
        System.out.println("Account Number: " + accn);
        System.out.println("Balance: " + bal);
    }

    void deposit(int amount) {
        if (amount > 0) {
            bal = bal + amount;
        }
    }

    void withdraw(int amount) {
        if (amount > 0 && amount <= bal) {
            bal = bal - amount;
        }
    }
}

public class Main6 {
    public static void main(String args[]) {
        BankAccount b = new BankAccount();
        b.set(12345, 1000);
        b.deposit(500);
        b.withdraw(300);
        b.get();
    }
}
