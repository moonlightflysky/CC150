package chapter7;

import java.util.LinkedList;

public class Q7 {
	
	public int getKthMagicNumber(int k){
		
		if (k < 0){
			return 0;
		}
		
		int val = 0;
		LinkedList<Integer> queue3 = new LinkedList<Integer>();	// contains number only with fraction factor 3
		LinkedList<Integer> queue5 = new LinkedList<Integer>();	// contains number with ony 5 and 3 & 5;
		LinkedList<Integer> queue7 = new LinkedList<Integer>();	// contains number with fractions only 7 , 7& 5, 7 & 5 &3
		
		queue3.offer(1);
		
		for (int i = 0; i < k; i++){
			
			int val3 = queue3.size() > 0 ? queue3.peek() : Integer.MAX_VALUE;
			int val5 = queue5.size() > 0 ? queue5.peek() : Integer.MAX_VALUE;
			int val7 = queue7.size() > 0 ? queue7.peek() : Integer.MAX_VALUE;
			
			val = Math.min(Math.min(val3, val5), val7);
			
			if (val == val3){
				queue3.poll();
				queue3.offer(3 * val);
				queue5.offer(5 * val);
				queue7.offer(7 * val);
			}
			
			else if (val == val5){
				queue5.poll();
				queue5.offer( 5 * val);
				queue7.offer( 7 * val);
			}
			
			else{
				queue7.poll();
				queue7.offer( 7 * val);
			}
		}
		
		return val;
		
	}
	
	public static void main(String[] argv){
		
		Q7 test = new Q7();
		int res = test.getKthMagicNumber(7);
		System.out.println(res);
		
	}

}
