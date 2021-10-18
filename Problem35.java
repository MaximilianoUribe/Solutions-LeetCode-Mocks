/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/
class Problem35 {
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        //declaring mid outside to use it outside the while loop
        int mid = 0;
        //implementing binary search in the array
        while(left<=right) {
            mid = left + ((right-left)/2);
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target) {
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        //if nums at mid is greater than target that means that 
        //mid is at the position where target should be inserted
        if(nums[mid]>target){
            return mid;
        //if it comes to this point means that nums at mid is less
        //than target so mid is at one position less of where it should
        // be inserted, so we add 1
        }else{
            return mid+1;
        }
    
    }
}