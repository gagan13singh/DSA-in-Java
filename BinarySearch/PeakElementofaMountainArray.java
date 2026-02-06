package BinarySearch;

//also known as Bitonic array.

public class PeakElementofaMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int ans=findPeakElement(arr);
        System.out.println(ans);
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
}
