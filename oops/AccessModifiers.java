package oops;

public class AccessModifiers {
    private int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public AccessModifiers(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

//In Java, the default access modifier is called package-private.
//If you don't write any access modifier (public, private, or protected),
//Java automatically gives it default/package-private access.

//1. private
//Accessible only within the same class.
//Not accessible in the same package.
//Not accessible by subclasses.
//Not accessible outside the package.
//        2. default (Package-Private)
//No keyword is written.
//Accessible within the same class.
//Accessible by all classes in the same package.
//Not accessible by subclasses in different packages.
//Not accessible outside the package.
//        3. protected
//Accessible within the same class.
//Accessible within the same package.
//Accessible by subclasses even if they are in different packages.
//Not accessible by non-subclasses outside the package.
//        4. public
//Accessible within the same class.
//Accessible within the same package.
//Accessible by subclasses in different packages.
//Accessible from anywhere in the program.

//Easy Order to Remember:
//private < default < protected < public