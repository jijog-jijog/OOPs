package Abstract;

abstract class Animal {
    abstract void makeSound(); // Every animal must define this
    void breathe() {
        System.out.println("All animals breathe oxygen 🌬️");
    }
}
class Dog extends Animal {
    @Override
     void makeSound() {
        System.out.println("Dog barks 🐶");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows 🐱");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Dog barks 🐶
        dog.breathe();   // All animals breathe oxygen 🌬️
    }
}
