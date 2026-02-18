package Patterns;

//steps to solve
//no. of lines = no. of rows = no. of times the outer loop will run
//identify for every row no. how many columns are there/types of elements in column
//what do you need to print

public class Pattern1 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
