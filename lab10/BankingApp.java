public class BankingApp {
    public static void main(String[] args) {
        CustomerAccount acc1 = new CustomerAccount("Harry", Bank.SBI, 12000);
        CustomerAccount acc2 = new CustomerAccount("John", Bank.ICICI, 15000);
        CustomerAccount acc3 = new CustomerAccount("Alice", Bank.HDFC, 10000);

        acc1.showAccountDetails();
        acc1.calculateInterest(2);

        acc2.showAccountDetails();
        acc2.calculateInterest(3);

        acc3.showAccountDetails();
        acc3.calculateInterest(1);
    }
}
