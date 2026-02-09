package BinarySearch;

public class RotatedArrayWithDuplicate {

    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int key = 0;

        int ans = search(arr, key);
        System.out.println("Index: " + ans);
    }

    static int search(int[] arr, int key) {

        int pivot = findPivotWithDuplicates(arr);

        // If array is not rotated
        if (pivot == -1) {
            return BinarySearch(arr, key, 0, arr.length - 1);
        }

        // If pivot itself is the target
        if (arr[pivot] == key) {
            return pivot;
        }

        // Search in left part
        if (key >= arr[0]) {
            return BinarySearch(arr, key, 0, pivot - 1);
        }

        // Search in right part
        return BinarySearch(arr, key, pivot + 1, arr.length - 1);
    }

    static int findPivotWithDuplicates(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Left side sorted
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            // Right side sorted
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int key, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

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