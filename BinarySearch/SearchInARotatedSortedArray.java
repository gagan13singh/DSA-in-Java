package BinarySearch;
//this won't work for duplicate values in array
public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        int target=6;
        System.out.println(search(arr,target));

    }

    static int search(int[] nums,int target){
        int pivot=findPivot(nums);
        if(pivot==-1){
            return BinarySearch(nums,target,0,nums.length-1);

        }
        if(target==nums[pivot]){
            return pivot;
        }
        if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int findPivot(int[]arr){
        int start=0,end=arr.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(mid<end && arr[mid]>arr[mid+1]){
               return mid;
           }
           if(mid>start && arr[mid]<arr[mid-1]){
               return mid-1;
           }
           if(arr[mid]<=arr[start]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }

        }
        return -1;
    }
    static int BinarySearch(int[] arr, int key,int start,int end) {

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
