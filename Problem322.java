/*
You are given an integer array coins representing coins of different
 denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount.
 If that amount of money cannot be made up by any combination of the coins,
 return -1.

You may assume that you have an infinite number of each kind of coin.


approach: 
dynamic bottom up approach, look for the minimun number of coins for amounts less
than the needed amount starting from 0 and going all the way to the top.
*/
class Problem322 {
	public int coinChange(int[] coins, int amount) {
        int[] numberOfCoins = new int[amount+1];
        Arrays.fill(numberOfCoins, amount+1);
        numberOfCoins[0] = 0;
        
        for(int i = 0; i<=amount;i++) {
            for(int j = 0; j<coins.length;j++) {
                if(coins[j]<=i) {
                    numberOfCoins[i] = Math.min(numberOfCoins[i], 1 + numberOfCoins[i-coins[j]]); 
                }
            }
        }
        if(numberOfCoins[amount]>amount)return -1;
        
        return numberOfCoins[amount];
    }
}