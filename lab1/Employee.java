
import java.util.Scanner;

public class Employee {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine();
        emp.name = scanner.nextLine();

        System.out.print("Enter Employee Age (e.g., 35.5): ");
        double inputAge = scanner.nextDouble();
        emp.age = (int) inputAge;

        System.out.print("Is Employee Permanent? (true/false): ");
        emp.isPermanent = scanner.nextBoolean();

        System.out.println("Successfully started");

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + emp.id);
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Permanent: " + emp.isPermanent);
    }
}
