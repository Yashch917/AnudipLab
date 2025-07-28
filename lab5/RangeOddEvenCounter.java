import java.util.Scanner;

public class RangeOddEvenCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the beginning of range (-1 to quit): ");
            int from = input.nextInt();
            if (from == -1) break;

            System.out.print("Enter the end of range: ");
            int to = input.nextInt();

            int countEven = 0, countOdd = 0;

            System.out.print("Even Numbers: ");
            for (int num = from; num <= to; num++) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                    countEven++;
                }
            }
            System.out.println("\nNumber of Even Numbers: " + countEven);

            System.out.print("Odd Numbers: ");
            for (int num = from; num <= to; num++) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                    countOdd++;
                }
            }
            System.out.println("\nNumber of Odd Numbers: " + countOdd);
            System.out.println();
        }
    }
}
