import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many values you want to input: ");
        int count = input.nextInt();

        int[] numbers = new int[count];
        int total = 0;

        System.out.println("Enter the values:");
        for (int index = 0; index < count; index++) {
            numbers[index] = input.nextInt();
            total += numbers[index];
        }

        double average = (double) total / count;

        System.out.println("Total Sum = " + total);
        System.out.println("Calculated Average = " + average);
    }
}
