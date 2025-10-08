package Practicejava;

class Animal {
    String name;
  
    public void eat() {
        System.out.println(name + " is eating.");
            }
    public void run() {
        System.out.println(name + " is running.");
    }
}

//child class
//Dog class inherits from Animal
class Dog extends Animal {
 String breed;

 public void bark() {
     System.out.println(name + " the " + breed + " is barking.");
 }
}


//main program 
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog myDog = new Dog();

        // Access and set inherited properties
        myDog.name = "Buddy";
        myDog.breed = "Germanshperd";

        // Call methods from both the child and parent classes
        myDog.eat();
        myDog.run();
        // Inherited from Animal class
        myDog.bark(); // Specific to the Dog class
    }
}