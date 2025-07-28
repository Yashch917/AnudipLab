package lab4;

import java.util.Scanner;

public class InternetBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total data consumed in GB: ");
        double totalData = scanner.nextDouble();

        double billAmount;


        if (totalData < 10) {
            billAmount = 300;
        } else if (totalData <= 30) {
            billAmount = 300 + 5 * (totalData - 10);
        } else {
            billAmount = 400 + 3 * (totalData - 30);
        }


        System.out.printf("Total Data Consumed: %.2f GB%n", totalData);
        System.out.printf("Your Monthly Internet Bill: ₹%.2f%n", billAmount);

    }
}
