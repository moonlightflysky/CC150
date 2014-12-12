package chapter18;

import java.util.Random;
import java.util.ArrayList;

public class Q3 {

	Random rand = new Random();
	
	public ArrayList<Integer> getRandNumsFromArray(int[] num, int n){
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		int N = num.length;
		int hi = N - 1;
		Random rand = new Random();
		
		while (hi > N - 1 - n){
			int r = rand.nextInt(hi + 1);
			exch (num, hi, r);
			res.add(num[hi]);
			hi--;
		}
		
		return res;
		
	}
	
	
	private void exch(int[] num, int i , int j){
		
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		
	}
	
}
