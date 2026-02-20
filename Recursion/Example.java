package Recursion;

//Recursion: A function that calls itself.
//Why recursion: It helps in solving bigger problems in a simple way.
//You can convert recursive solution into iterations and vice versa.
//Space complexity is not constant because each call takes memory in stack.

public class Example {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n>5){                     //base condition (where recursion stops making new function calls.)
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}