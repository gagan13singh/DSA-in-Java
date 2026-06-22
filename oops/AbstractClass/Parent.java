package oops.AbstractClass;

//ABSTRACT CLASS EXAMPLE

abstract public class Parent {
    int age;
    abstract void career();
    abstract void partner();

    public Parent(int age) {
        this.age=age;
    }
}

// Final keyword cant be used with abstract keywords.