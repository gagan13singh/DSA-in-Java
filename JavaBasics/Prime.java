package JavaBasics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        prime(n);
    }
    static void prime(int n){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                System.out.println("the number is not prime");
                break;
            }
            else {
                isPrime=true;
                System.out.println("the number is prime");
            }
        }
    }
}
