package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n=4;
        pattern9(n);
    }
    static void pattern9(int n){
        int original = n;
        n=2*n;

        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=original- Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
