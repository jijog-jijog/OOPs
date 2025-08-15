package Shapes;

 class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
     void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a; // reference of parent

        a = new Dog(); // object is Dog
        a.sound();     // "Dog barks" → chosen at runtime

        a= new Cat(); // object is Cat
        a.sound();     // "Cat meows" → chosen at runtimeCat meows" → chosen at runtime
    }
}
