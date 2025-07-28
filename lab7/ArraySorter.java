import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements:");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }

        System.out.println("Array after sorting:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
    }
}
