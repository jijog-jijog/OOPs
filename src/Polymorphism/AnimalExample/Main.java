package Polymorphism.AnimalExample;

public class Main {
    public static void main(String[] args) {
        // Create Animal reference with Animal object
        Animal animal1 = new Animal();
        
        // Create Animal reference with Dog object
        Animal animal2 = new Dog();
        
        // Create Dog reference with Dog object
        Dog dog = new Dog();
        
        System.out.println("Calling sound() from Animal reference with Animal object:");
        animal1.sound();  // Calls Animal's sound() method
        
        System.out.println("\nCalling sound() from Animal reference with Dog object:");
        animal2.sound();  // Calls Dog's sound() method (polymorphism in action)
        
        System.out.println("\nCalling sound() from Dog reference with Dog object:");
        dog.sound();      // Calls Dog's sound() method
    }
}
