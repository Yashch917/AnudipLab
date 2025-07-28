package lab3;

import java.util.Scanner;

public class Rectangle {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and width for Rectangle 1:");
        System.out.print("Length: ");
        int length1 = scanner.nextInt();
        System.out.print("Width: ");
        int width1 = scanner.nextInt();

        System.out.println("Enter length and width for Rectangle 2:");
        System.out.print("Length: ");
        int length2 = scanner.nextInt();
        System.out.print("Width: ");
        int width2 = scanner.nextInt();

        Rectangle rectangle1 = new Rectangle(length1, width1);
        Rectangle rectangle2 = new Rectangle(length2, width2);

        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }

    }
}
