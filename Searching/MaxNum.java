package Searching;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr= {180,12,9,14,77,50};
        int max=findMax(arr);
        System.out.println("Maximum number is "+max);
    }
    static int findMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
    return max;
    }
}
