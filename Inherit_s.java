// Base class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Inherit_s {
    public static void main(String[] args) {
        Animal a;   // reference of base class

        Dog d = new Dog();
        Cat c = new Cat();

        a = d;
        a.sound();   // calls Dog's sound()

        a = c;
        a.sound();   // calls Cat's sound()
    }
}
