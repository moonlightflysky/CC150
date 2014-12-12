package chapter5;

import java.util.ArrayList;

public class Q7 {
	
	private static final int R = 32;
	
	public int findMissingInteger(ArrayList<Integer> array){
		
		return findHelper(array, 0);
	}
	
	private int findHelper(ArrayList<Integer> array, int col){
		
		if (col == R){
			return 0;
		}
		
		ArrayList<Integer> zeroList = new ArrayList<Integer>();
		ArrayList<Integer> oneList = new ArrayList<Integer>();
		
		for (Integer i : array){
			if (fetch(i, col) == 0){
				zeroList.add(i);
			}
			
			else{
				oneList.add(i);
			}
		}
		
		if (zeroList.size() <= oneList.size()){
			int v = findHelper(zeroList, col + 1);
			return (v << 1) | 0;
		}
		
		else{
			int v = findHelper(oneList, col + 1);
			return (v << 1) | 1;
		}
		
		
	}
	
	private int fetch(int num, int col){
		
		return (num >> col) & 1;
		
	}
	
	
	public static void main(String[] argv){
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i <= 18; i++){
			if (i == 4){
				continue;
			}
			array.add(i);
		}
		Q7 test = new Q7();
		int res = test.findMissingInteger(array);
		System.out.println(res);
		
	}

}
