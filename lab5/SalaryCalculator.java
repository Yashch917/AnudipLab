import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the base salary: ");
            double baseSalary = input.nextDouble();

            double houseAllowance, dearnessAllowance;

            if (baseSalary > 15000) {
                houseAllowance = baseSalary * 0.20;
                dearnessAllowance = baseSalary * 0.60;
            } else {
                houseAllowance = 3000;
                dearnessAllowance = baseSalary * 0.70;
            }

            double totalSalary = baseSalary + houseAllowance + dearnessAllowance;
            System.out.println("Total Gross Salary: " + totalSalary);

            System.out.print("Type -1 to calculate again or any other number to exit: ");
            if (input.nextInt() != -1) break;
        }
    }
}
