import java.util.Arrays;

public class LC322 {
    public int coinChange(int[] coins, int amount) {

        if(amount == 0) return amount;
        if(amount < 0) return -1;

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for(int i=0; i< dp.length; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                        dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                    }
                }
        }

        return dp[amount] > amount ? -1 : dp[amount] ;

    }
}
