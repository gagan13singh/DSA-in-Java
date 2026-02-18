package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=2*n;i++){
            int c=i>n? 2*n-i:i;
            int noOfSpaces=n-c;
            for(int j=1;j<=noOfSpaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
