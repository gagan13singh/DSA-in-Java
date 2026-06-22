package oops.AbstractClass;

public class Son extends Parent {

    int age;
    int setAge(int age) {
        return this.age = age;
    }

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I will be an engineer");
        System.out.println(super.age);
    }
    @Override
    void partner() {
        System.out.println("Hello partner!");
    }
}
