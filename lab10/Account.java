public class Account {
    private String holderName;
    private String institutionName;
    private double balance;

    public Account(String holderName, String institutionName, double openingBalance) {
        this.holderName = holderName;
        this.institutionName = institutionName;
        this.balance = openingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void showAccountInfo() {
        System.out.println("Account Holder: " + holderName + ", Bank: " + institutionName + ", Balance: " + balance);
    }
}
