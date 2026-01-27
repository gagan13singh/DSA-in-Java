package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("original array");
        System.out.println(Arrays.toString(nums));
        System.out.println("Updated array");
        change(nums);

    }
    static void change(int[] arr){
        arr[0]=arr[0]+1;
        System.out.println(Arrays.toString(arr));


        }

}
