//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create objects using the constructor
        Student s1 = new Student("Badmus", 17, "Information Technology");
        Student s2 = new Student("Tolu", 18, "Computer Science");

        // Call the method on each object
        s1.introduce();
        System.out.println(); // blank line
        s2.introduce();
    }
}
