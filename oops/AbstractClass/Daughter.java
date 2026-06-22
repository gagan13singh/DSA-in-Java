package oops.AbstractClass;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I will be a doctor.");
    }
    @Override
    void partner() {
        System.out.println("Hello partner!");
    }
}
