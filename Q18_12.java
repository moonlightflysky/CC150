package chapter18;

public class Q12 {

	public int maxSubMatrix(int[][] matrix){
		
		int M = matrix.length;
		int N = matrix[0].length;
		int globalMax = Integer.MIN_VALUE;
		
		for (int startRow = 0; startRow < M; startRow++){
			
			int colSum[] = new int[N];
			for (int endRow = startRow; endRow < M; endRow++){
				
				for (int col = 0; col < N; col++){
					if (endRow == startRow){
						colSum[col] = matrix[endRow][col];
					}
					
					else{
						colSum[col] += matrix[endRow][col];
					}
				}
				
				int curMax = findMaxSubArray(colSum);
				globalMax = Math.max(curMax, globalMax);
				
			}
			
		}
		
		return globalMax;
		
	}
	
	private int findMaxSubArray(int[] num){
		
		int N = num.length;
		int globalMax = Integer.MIN_VALUE;
		
		int dp[] = new int[N];
		dp[0] = num[0];
		
		for (int i = 1; i < N; i++){
			dp[i] = Math.max(dp[i - 1] + num[i], num[i]);
			globalMax = Math.max(dp[i], globalMax);
		}
		
		return globalMax;
	}
	
	
	public static void main(String[] argv){
		
		int[][] matrix = {{1, -2, -1, 3}, {2, 2, 3, 4}, {4, -8, 9, 0}, {5, 5, 5, -20}};
		
		Q12 test = new Q12();
		int res = test.maxSubMatrix(matrix);
		
		System.out.println(res);
		
	}
	
}
