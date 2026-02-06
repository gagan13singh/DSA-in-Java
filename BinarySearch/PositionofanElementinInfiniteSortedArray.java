package BinarySearch;

public class PositionofanElementinInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target=20;
        System.out.println(findRange(arr,target));
    }
    static int findRange(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int newStart=end+1;
            end= end+ (end-start+1)*2;
            start=newStart;
        }
        return BinarySearch(nums,target,start,end);
    }
    static int BinarySearch(int[] arr, int key, int start, int end) {

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
