public class AccountTest {
    public static void main(String[] args) {

        Account acc1 = new Account("Alice", "ICICI", 5000);
        Account acc2 = new Account("Bob", "HDFC", 10000);
        Account acc3 = new Account("Charlie", "SBI", 2000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.showAccountInfo();

        acc2.deposit(500);
        acc2.withdraw(2000);
        acc2.showAccountInfo();

        acc3.deposit(1000);
        acc3.withdraw(500);
        acc3.showAccountInfo();
    }
}
