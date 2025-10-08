package Practicejava;
 class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // The polymorphic method that will be overridden by subclasses
    public void performRole() {
        System.out.println(name + " is performing a general person's role.");
    }
}


    class Students extends Person {
    private String major;

    public Students(String name, String major) {
        super(name); // Call the constructor of the parent class
        this.major = major;
    }

    // Override the parent's method to provide a specific behavior
    @Override
    public void performRole() {
        System.out.println(getName() + " is a student, studying " + major + ".");
    }
}




 class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name); // Call the constructor of the parent class
        this.subject = subject;
    }

    // Override the parent's method to provide a specific behavior
    @Override
    public void performRole() {
        System.out.println(getName() + " is a teacher, instructing students in " + subject + ".");
    }
}



public class PolymorphismDemo {
    public static void main(String[] args) {
        // Create objects of the different subclasses
        Person students = new Students("Alice", "Computer Science");
        Person teacher = new Teacher("Mr. Smith", "Physics");
        Person generalPerson = new Person("Bob");

        // Use a single method call on the generic 'Person' type.
        // The JVM automatically calls the correct overridden method at runtime.
        System.out.println("Demonstrating different roles:");
        students.performRole();
        teacher.performRole();
        generalPerson.performRole();
    }
}