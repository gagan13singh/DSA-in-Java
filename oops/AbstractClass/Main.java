package oops.AbstractClass;

public class Main {
    public static void main(String[] args) {

        //Parent p=new Parent(23);

        Son son=new Son(25);
        son.career();
        System.out.println(son.age);
//        int a= son.setAge(29);
//        System.out.println(a);

        Daughter daughter=new Daughter(22);
        daughter.career();
    }
}
// We cant create abstract objects.
//A static method cannot be abstract because:
//Static methods belong to the class.
//Abstract methods must be overridden by objects/subclasses.
//Static methods are not overridden (they are hidden).