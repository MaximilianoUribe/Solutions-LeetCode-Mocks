/*
You are climbing a staircase. 
It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?

Explanation:
I will be using dynamic to not repeat sub problems.
We want to start from the base case where the step we can make 
are 1 and 1, this is in n and n-1.
the other subproblems depend on the sum of those two,
so we only have to add them together and then shift the pointers
to the values of the new numbers until we reach the number n-2(because
we already computed 2 possibilities of steps at the start)
*/


class Problem70 {
	public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        
        for(int i = 0; i<n-1;i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
       
    }
}