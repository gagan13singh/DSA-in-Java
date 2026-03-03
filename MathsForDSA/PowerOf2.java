package MathsForDSA;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=16;
        boolean ans = (n & (n-1)) == 0;  //works for all except n=0.
        System.out.println(ans);
    }
}
