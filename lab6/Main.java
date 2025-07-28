public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

       Student s2 = new Student("Eden", 20);

        Student s3 = new Student("Stein", 32, "Computer Science");

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
