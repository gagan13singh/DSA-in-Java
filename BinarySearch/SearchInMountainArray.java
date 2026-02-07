package BinarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int key=3;
        int ans= search(arr,key);
        System.out.println(ans);
    }
    static int search(int[] arr, int key) {
        int peak=findPeakElement(arr);
        int firstTry=orderAgnosticBS(arr,key,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
            return orderAgnosticBS(arr,key,peak+1,arr.length-1);

    }
    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid; //may be an answer
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr, int key,int start,int end) {

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
