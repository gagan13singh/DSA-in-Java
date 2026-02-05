package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr={-12,0,1,3,45,65,76};
        int key=55;
        FloorVal(arr,key);
    }
    static void FloorVal(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        if (key < arr[0])
            System.out.println("floor dosen't exist");
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (key < arr[mid]) {
                    end = mid - 1;
                } else if (key > arr[mid]) {
                    start = mid + 1;
                } else {
                    System.out.println(arr[mid]);
                    return;
                }
            }
            System.out.println(arr[end]);
        }
    }
}