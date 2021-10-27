/*
Given an integer array nums, 
find the contiguous subarray 
(containing at least one number) which has the 
largest sum and return its sum.

A subarray is a contiguous part of an array.
*/
class Problem53 {
	public int maxSubArray(int[] nums) {
		/*
		in my first approach i will implement the brute force 
		solution to this problem

		i will check each sub array in the array and i will 
		store the sum of that subarray in variable 
		and return that variable once it has checked all 
		subarrays, i would check the sum of each subarray with a
		helper solution.

		this solution would have a complexity of O(n^2) since
		i have two nested loops depending on the length of
		the array.
		*/

		//if we only have one number 
		if(nums.length == 1)
			return nums[0];

		//declare the variable to return
		int sum = Integer.MIN_VALUE;

		//iterate through the array
		for(int i = 0; i< nums.length; i++) {
			for(int j = 0; j< nums.length; j++) {
				//getting the sum of the sub array
				//with parameters i and j
				int sumOfSumArray = sumOfSumArray(nums, i, j);

				if(sumOfSumArray>sum)
					sum = sumOfSumArray;
			}
		}
		return sum;
	}
	//helper methos that return the sum of the subarray
	public int sumOfSumArray(int[] nums, int left, int right) {
		int sum = 0;

		for(int i = left; i<=right; i++) {
			sum+=nums[i];
		}
		return sum;
	}

	/*
	here i will implement a better solution that has a time
	complexity of O(n)

	for this solution we i will use the kadanes algorithm, this
	algorithm is specifically used for getting the max sum of a
	subarray in an array

	how I understand this algorithm is that we want to work with 
	what we have, we start from index 0 and we want to check which
	is greater first the sum we already have or the sum we have plus 
	the next number
	*/
	public int kadanesAlgorithm(int[] nums) {
		//edge case
		if(nums.length == 1) 
			return nums[0];

		int maxSum = nums[0];
		int currSum = maxSum;

		for(int i = 0; i<nums.length; i++) {
			currSum = Math.max(currSum+nums[i], nums[i]);
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}
}

























