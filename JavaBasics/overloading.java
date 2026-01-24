package JavaBasics;

public class overloading {
    public static void main(String[] args) {
        fun(10);
        fun("Gian");
        fun(10,100);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun (String a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a+b);
    }
}
