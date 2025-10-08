package Practicejava;

class Student {
    // 1. Private instance variables:
    // Hides the data from direct external access.
    private String name;
    private int age;

    // Public constructor to initialize the object.
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 2. Public getter methods:
    // Used to read the values of the private variables.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 3. Public setter methods:
    // Used to modify the values of the private variables.
    // They can include validation logic to protect data integrity.
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be a positive number.");
        }
    }
}

public class encapsulated {
    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("Alice", 20);

        // Access the data using public getter methods
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());

        // Attempt to directly modify a private variable (this will cause a compilation error)
        // student1.age = 22; // Uncommenting this line will cause an error

        // Modify the age using the public setter method
        student1.setAge(21);
        System.out.println("\nAfter updating age...");
        System.out.println("New Age: " + student1.getAge());

        // Attempt to set an invalid age (the validation logic will prevent it)
        student1.setAge(-5);
        System.out.println("Age remains: " + student1.getAge());
    }
}