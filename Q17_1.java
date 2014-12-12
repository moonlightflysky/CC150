package chapter17;

public class Q1 {
	
	public void swapInplace(int[] num, int a, int b){
		
		num[a] = num[b] - num[a];
		num[b] = num[b] - num[a];
		num[a] = num[a] + num[b];
		
	}

}
