package Searching;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {180,77,0},
                {18,1,9,7,5},
                {10,12,91,14,7,50},
        };
        int target=91;
        search(arr,target);
    }
static void search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==target){
                System.out.println("element found at "+i+","+j);
            }
        }
        }
}
}
