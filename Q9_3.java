package chapter9;

public class Q3 {
	
	public int findMagic (int[] array){		// with distinct sorted array;
		if (array == null || array.length == 0){
			return -1;
		}
		
		int N = array.length;
		int lo = 0;
		int hi = N - 1;
		
		return magicHelper(array, lo, hi);
	}
	
	private int magicHelper(int[] array, int lo, int hi){
		
		if (lo > hi){
			return -1;
		}
		
		int midIndex = lo + (hi - lo) /2;
		int midVal = array[midIndex];
		
		if (midIndex == midVal){
			return midIndex;
		}
		
		int leftIndex = Math.min(midIndex - 1, midVal);
		int left = magicHelper(array, lo, leftIndex);
		if (left > 0){
			return left;
		}
		
		int rightIndex = Math.max(midIndex + 1, midVal);
		int right = magicHelper(array, rightIndex, hi);
		return right;
		
		
	}
	
	
	

}
