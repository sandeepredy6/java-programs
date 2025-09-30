public class StudentMain {
    public static void main(String[] args) {
        // Create the first Student object
        Student student1 = new Student("Sandeep", 33,  90);

        // Create a second Student object
        Student student2 = new Student("akhila", 30, 80);

        // Display the details of the first student
        student1.displayDetails();

        // Display the details of the second student
        student2.displayDetails();
    }
}

class Student{

    // Attributes
    private String name;
    private int age;
    private double marks;

    // Parameterized constructor to initialize the object
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
        System.out.println("-----------------------");
    }

    // Getter methods to access the attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }
}



