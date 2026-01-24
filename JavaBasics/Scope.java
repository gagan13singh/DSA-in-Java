package JavaBasics;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            a=17;
            int c=19;

        }
       // System.out.println(c); it will give error.
    }
    static void random(int a){
        int num=67;
        System.out.println(num);

    }
}
//If interviewer pushes further (“Is this OOP parent–child?”)

//Best response:
//“It’s not an object-oriented parent–child relationship. It’s a scope hierarchy that controls visibility and lifetime of variables.”

//🎯 One-line placement gold answer
//Block scope is based on lexical scoping where inner blocks form a hierarchical visibility structure similar to parent–child, but without inheritance or polymorphism.