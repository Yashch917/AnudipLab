public class CustomerAccount {
    private String holderName;
    private Bank bank;
    private double balance;

    public CustomerAccount(String holderName, Bank bank, double initialBalance) {
        this.holderName = holderName;
        this.bank = bank;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void showAccountDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Bank: " + bank);
        System.out.println("Balance: " + balance);
    }

    public void calculateInterest(int years) {
        double interest = bank.getInterestRate() * years * balance / 100;
        System.out.println("Total interest for " + years + " years: " + interest);
    }
}
