import java.util.Scanner;

public class Student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter student name: ");
        student.studentName = scanner.nextLine();

        System.out.print("Enter college name: ");
        student.collegeName = scanner.nextLine();

        System.out.print("Enter student ID: ");
        student.studentID = scanner.nextInt();

        scanner.close();

        System.out.println("Successful");

        System.out.println("Student Details:");
        System.out.println("Name: " + student.studentName);
        System.out.println("College: " + student.collegeName);
        System.out.println("Student ID: " + student.studentID);
    }
}
