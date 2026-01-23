import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        int ans= sum2(20,30);
        System.out.println(ans);

    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = sc.nextInt();
        System.out.println("Enter number2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of nos. is " + sum);
    }

    static int sum1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = sc.nextInt();
        System.out.println("Enter number2");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }
    static int sum2(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

