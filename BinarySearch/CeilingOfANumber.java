package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr={-12,0,1,3,45,65,76};
        int key=55;
       CeilingValue(arr,key);


    }

    static void CeilingValue(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println( mid);
            }
        }
        System.out.println(arr[start]);
    }
}
