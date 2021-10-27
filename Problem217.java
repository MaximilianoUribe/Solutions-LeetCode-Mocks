/*
Given an integer array nums, 
return true if any value appears 
at least twice in the array, 
and return false if every element is distinct.
*/
/*
My approach here was to use a hash set and if the hashset
contains the value at position return true.
If the loop ends this means there is not duplicates,
so return false
*/

class Problem217 {
	public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++) {
            if(set.contains(nums[i]))
                return true;
            
            set.add(nums[i]);
        }
        return false;
    }
}