package Arrays;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        System.out.println("using .toString method");
       int[] arr=new int[10];
       //System.out.println(arr);
       int[] arr1= {1,2,3,4,5};
       System.out.println(Arrays.toString(arr1));

        System.out.println("using for loop");
        System.out.println("enter elements");//using for loop
        int[] arr2= new  int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i < arr2.length; i++){
            arr2[i]=sc.nextInt();

        }
        for (int i=0; i < arr2.length; i++){
            System.out.println(arr2[i]+" ");
        }

        System.out.println("using for each loop");

        for(int i:arr2){
            System.out.print(i+" ");

        }
    }

}
