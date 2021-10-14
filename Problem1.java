/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

You can return the answer in any order.
*/


class Problem1 {
	public int[] twoSum(int[] nums, int target) {
		//creating the array for the result
        int[] result = new int[2];
        //creating a hashmap to look for the value 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //using a loop to map the values and also check if the
        //result is already inside
        for (int i = 0; i < nums.length; i++) {
        	//first cheking if we already have the result
        	//since there is only two numbers that can sum up to
        	//the result we can assume that substracting the target
        	//from the number at i, if the result is on the map,
        	//we have our two numbers (nums[i], target-nums[i])
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            //mapping the elements if the condition is not met
            //we put the number in the key and the index in the value
            //since we want to return the index not the values
            map.put(nums[i], i);
        }
        //return the array already filled
        return result;
    }
    //since this solution only runs the length of nums once in the
    //worst case its complexity would be O(n)
    
}