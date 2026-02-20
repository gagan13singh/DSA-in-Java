package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(46));
    }
    static int fib(int k) {

        if(k<2){
            return k;
        }
        return fib(k-1)+fib(k-2);


    }
}

//Types of recurrence relations:
//1.Linear Recurrence relations (inefficient)
//2.Divide and Conquer