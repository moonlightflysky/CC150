package chapter5;

public class Q1 {
	
	public int bitUpdate(int M, int N, int i , int j){
		
		int left = ~((1 << (j + 1)) - 1);
		int right = (1 << i) - 1;
		
		int mask = left + right;
		
		int M1 = M & mask;
		int N1 = N << i;
		
		int res = M1 + N1;
		
		return res;
	}
	
	public static void main(String[] argv){
		
		int M = Integer.parseInt("100000100100", 2);
		int N = Integer.parseInt("11111", 2);
		int i = 2, j = 6;
		Q1 test = new Q1();
		int res = test.bitUpdate(M, N, i, j);
		System.out.println(Integer.toBinaryString(res));
		
	}

}
