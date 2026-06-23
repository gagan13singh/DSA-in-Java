package oops.Interfaces;

//Nested Interfaces

class A {

    interface B {
        void greet();
    }
}
public class NestedTest implements A.B {

    @Override
    public void greet() {
        System.out.println("Hello");
    }
     public static void main(String[] args) {
         NestedTest t = new NestedTest();
         t.greet();
     }

}


