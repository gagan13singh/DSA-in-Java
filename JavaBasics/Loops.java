import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        int i=1;
        System.out.println("while loop");
        while(i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("for loop");
        for(int j=1;j<=5;j++){
            System.out.println(j);
        }
        System.out.println("do while loop");
        int k=1;
        do {
            System.out.println(k);
            k++;
        }while(k<=5);
    }
}
