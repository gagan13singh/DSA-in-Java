package Searching;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int num = sc.nextInt();
        int[] arr= {18,12,9,14,77,50};
        linearSearch(arr,num);
    }
    static void linearSearch(int[] arr,int key){
        boolean found=false;
        if(arr.length==0){
            System.out.println("empty array");
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                found=true;
                System.out.println(arr[i]+" found at index "+i);
                break;
            }
        }
        if(!found){
            System.out.println(key+" not found in the array ");
        }
    }
}