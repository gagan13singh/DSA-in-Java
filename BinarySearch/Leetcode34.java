package BinarySearch;
//Find first and last position of element in sorted array
//Facebook interview
import java.util.Arrays;
public class Leetcode34 {
    public static void main(String[] args) {
        int[] arr = {-12, 0, 13, 13, 45, 65, 76};
        int key = 13;
        System.out.println(Arrays.toString(searchRange(arr, key)));

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
