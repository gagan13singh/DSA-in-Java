import java.util.*;

public class CountingNumOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println("Enter the number to count");
        int m = sc.nextInt();

        int a = 0;

        for (; n > 0; n = n / 10) {
            int k = n % 10;

            if (k == m) {
                a++;
            }
        }

        System.out.println(a);
    }
}
