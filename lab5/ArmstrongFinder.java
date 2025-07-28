import java.util.Scanner;

public class ArmstrongFinder {

    public static void displayArmstrongNumbers(int lower, int upper) {
        for (int value = lower; value <= upper; value++) {
            int original = value, result = 0;
            while (original > 0) {
                int digit = original % 10;
                result += digit * digit * digit;
                original /= 10;
            }
            if (result == value) {
                System.out.print(value + "  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lower Limit: ");
        int min = input.nextInt();
        System.out.print("Enter the Upper Limit: ");
        int max = input.nextInt();
        System.out.println("Armstrong Numbers within range:");
        displayArmstrongNumbers(min, max);
    }
}
