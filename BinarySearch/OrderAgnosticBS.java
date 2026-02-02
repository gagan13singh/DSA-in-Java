package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99, 87, 67, 65, 54, 34, 32, 2, 0};
        int key = 67;
        int ans = orderAgnosticBS(arr, key);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        // determine order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAsc) { // ascending
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending
                if (key > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
