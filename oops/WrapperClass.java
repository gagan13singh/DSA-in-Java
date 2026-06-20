package oops;

public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        Integer num = 145;
        System.out.println(num.byteValue());

        final int abc=100;
        //abc=abc+1;
        System.out.println(abc);
    }
}
//int is a primitive type that stores a value directly,
// whereas Integer is a wrapper class that stores the value as an object
// and provides additional utility methods.

// final keyword: value cannot be changed once assigned.
// final variables must be initialized exactly once.
// Can be used with both primitives and objects.

// Primitive:
//final int x = 10;
// x = 20;  // Error

// Object:
//final StringBuilder sb = new StringBuilder("Hello");
//sb.append(" World");   // Allowed (object state can change)
// sb = new StringBuilder("New"); // Error (reference cannot change)