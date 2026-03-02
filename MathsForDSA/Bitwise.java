package MathsForDSA;

public class Bitwise {
    public static void main(String[] args) {
        int n=676;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
