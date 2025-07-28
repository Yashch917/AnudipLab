package lab4;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects (out of 100 each):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                i--;
                continue;
            }

            total += marks[i];
        }

        double average = total / 5.0;

        System.out.println("\nTotal Marks: " + total + "/500");
        System.out.println("Average: " + average + "%");

        char grade;
        String gradeLabel;

        if (average > 90) {
            grade = 'E';
            gradeLabel = "Excellent";
        } else if (average > 80) {
            grade = 'A';
            gradeLabel = "Very Good";
        } else if (average > 60) {
            grade = 'B';
            gradeLabel = "Good";
        } else if (average >= 40) {
            grade = 'C';
            gradeLabel = "Pass";
        } else {
            grade = 'F';
            gradeLabel = "Fail";
        }

        System.out.println("Grade: " + grade + " (" + gradeLabel + ")");

    }
}
