package BinarySearch;

public class Binary {
    public static void main(String[] args) {
    int[] arr={-12,0,1,3,45,65,76};
    int key=10;
    int ans=BinarySearch(arr,key);
    System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end) / 2;// might be possible that start+end exceeds int value in java
            int mid = start + (end - start) / 2; //better way to find mid
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
