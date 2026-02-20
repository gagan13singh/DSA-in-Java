package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static int fib(int k) {

        if(k<2){
            return k;
        }
        return fib(k-1)+fib(k-2);


    }
}
