package oops;

public class ImportantKeywords {
    public static void main(String[] args) {

    }
    public static void message(){
        System.out.println("Hello World");
    }
}

// The static keyword is used to create class-level variables and methods
// that belong to the class rather than individual objects.
// Static members are shared among all objects,
// and only one copy exists in memory.
// A static method cannot directly access non-static variables or
// non-static methods because they belong to objects,
// while a static method belongs to the class
// A static method cannot directly access non-static variables or methods.
// To access them, you must create (or have a reference to) an object and
// use that object.
// this keyword cannot be used inside a static method.