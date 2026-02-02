package JavaBasics;

public class All3DigitArmstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            if(armstrongNum(i)){
                System.out.println(i);

            }
        }
    }

    static boolean armstrongNum(int n) {
        int original = n;
        int num = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            num = num + (rem * rem * rem);
        }
        if (num == original) {
           return true;
        } else {
            return false;
        }

    }
}
