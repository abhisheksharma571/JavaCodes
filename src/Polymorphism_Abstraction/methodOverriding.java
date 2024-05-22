package Polymorphism_Abstraction;

class Animal2 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal2 {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Animal2 animal = new Dog(); // Upcasting
        animal.sound(); // Calls the sound() method of Dog class at runtime
    }
}
