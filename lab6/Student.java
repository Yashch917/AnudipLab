class Student {
    String name;
    int age;
    String department;


    Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }


    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }


    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}
