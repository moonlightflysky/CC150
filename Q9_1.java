package chapter9;

public class Q1 {

	public int countWays(int n){
		
		if (n <= 0){
			return 0;
		}
		
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		
		for (int i = 3; i <= n; i++){
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		return dp[n];
	}
	
	
}
