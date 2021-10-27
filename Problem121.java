/*
You are given an array prices where prices[i] 
is the price of a given stock on the ith day.

You want to maximize your profit by choosing a 
single day to buy one stock and choosing a different 
day in the future to sell that stock.

Return the maximum profit you can achieve from 
this transaction. If you cannot achieve any profit, return 0.
*/
/*
How I see the solution for this problem is that we only work with
what we have at the moment, for example, first I have the costPrice
being equal to the first number in the array, then I will treat every
other next number as possible day to sell, then if a opportunity to
buy the stock at a cheaper price occurs, I will take that possibility 
and then messure the profit from there but changing this would not
affect in the max profit I already have, unless there comes a profit
greater to the one I had.
*/
class Problem121 {
	public int maxProfit(int[] prices) {
		int costPrice = prices[0];
		int maxValue = 0;

		for(int i = 1; i<price.length;i++) {
			maxValue = Math.max(maxValue, prices[i]-costPrice);

			if(prices[i]<costPrice)
				costPrice = prices[i];
		}
		return maxValue;
	}
}