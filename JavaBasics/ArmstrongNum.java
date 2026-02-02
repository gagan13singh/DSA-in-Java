package JavaBasics;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n=153;
        armstrongNum(n);

    }
    static void armstrongNum(int n){
        int original=n;
        int num = 0;
        while(n>0) {
            int rem = n % 10;
            n = n / 10;

            num = num + (rem * rem * rem);
        }
            if(num==original) {
                System.out.println("yes,it's an Armstrong number");
            }
            else{
                System.out.println("no,it is not an Armstrong number");
            }

        }
    }

