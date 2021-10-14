/*
Given an integer array nums and an integer val, 
remove all occurrences of val in nums in-place. 
The relative order of the elements may be changed.

Since it is impossible to change the length of the array 
in some languages, you must instead have the result be placed in 
the first part of the array nums. More formally, 
if there are k elements after removing the duplicates, 
then the first k elements of nums should hold the final result. 
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k 
slots of nums.

Do not allocate extra space for another array. 
You must do this by modifying the input array in-place 
with O(1) extra memory.
*/
class Problem27{
	public int removeElement(int[] nums, int val) {
        //count for the number of times any number
        //in nums is not equal to val
        //this is what we want to return 
        int count = 0;
        
        //iterating through the array and looking for the 
        //numbers that are not equal to val
        for(int i = 0; i < nums.length; i++) {
        	//if the number is not equal to val
        	//we put the number at the index of the
        	//count since we have to have the numbers that
        	//are not equal to val first in our array
        	//then just increment count to the next index 
            if(nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
            
        }
        //return the number of times nums[i]!=val
        return count;
    }
}