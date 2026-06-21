package oops;

class Parent {
    int a = 10;
}

class Child extends Parent {
    void show() {
        System.out.println(a);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

//In Java, every class ultimately inherits from the root class:
//Java Object
//So even if you don't explicitly extend anything:
//class Parent {}
//Java treats it as:
//class Parent extends Object {}

//The super keyword refers to the immediate parent class object,
// not to grandparents or higher ancestors directly.