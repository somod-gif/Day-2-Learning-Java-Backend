public class Student {
    String name;
    int age;
    String department;

    // Constructor
    public Student(String studentName, int studentAge, String studentDept) {
        name = studentName;
        age = studentAge;
        department = studentDept;
    }

    // Method
    public void introduce() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("Department: " + department);
    }
}

