package chapter18;

import java.util.Random;

public class Q2 {
	
	
	public void shuffle(int[] a){
		
		int N = a.length;
		Random rand = new Random();
		
		for (int i = 0; i < N; i++){
			
			int r = rand.nextInt(i + 1);
			exch(a, i, r);
			
		}
		
	}
	
	private void exch(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
