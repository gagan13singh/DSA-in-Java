package oops;

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

public class PolymorphismEx {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting

        a.sound();
    }
}

// Polymorphism types:
// 1.Compile Time/Static    2. Run time / Dynamic
// Static is achieved via method overloading.
// Dynamic is achieved via method overriding.
//final keyword is used to prevent overriding of methods and inheritance.
//If a class is final,then all its methods are also declared as final.

// Upcasting means storing a child class object in a parent class reference.
// It happens automatically (implicit casting).

// Dynamic Method Dispatch:-
// Dynamic Method Dispatch is the mechanism that enables runtime polymorphism.
// It works only with method overriding.
// The method to execute is decided at runtime.
// Decision is based on the actual object type, not the reference type.

//Static methods can be inherited but not overridden because,
//Static doesn't depend on objects.