import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        swap2(a,b);
    }
    static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swapped values : now a= "+a+" b= "+b);
    }
    static void swap2(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swapped values : now a= "+a+" b= "+b);
    }
}
