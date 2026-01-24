package JavaBasics;

public class Shadowing {
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        int x=100;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
//Shadowing-: variable with higher scope gets shadowed,lower scope overrides the higher.