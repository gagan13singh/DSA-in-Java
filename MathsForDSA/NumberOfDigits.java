package MathsForDSA;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n=4;
        int b=2;
        int ans=(int)(Math.log(n)/Math.log(b)+1);
        System.out.println(ans);
    }
}
