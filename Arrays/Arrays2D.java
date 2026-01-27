package Arrays;

import java.util.*;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr =new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
               System.out.print(arr[i][j]+" ");}
                System.out.println();
            }

        //System.out.println(Arrays.toString(arr)); //prints address of arrays in the array instead use deepToString method
                                                    //but not recommended for interviews
        //toString method
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        }
    }
// int[] arr={ {},{},{} } //array of arrays.