package chapter18;

public class Q4 {
	
	public int get2Nums(int num){
		
		int count = 0;
		
		int len = (int)Math.floor(Math.log10(num) + 1);
		
		for (int digit = 0; digit < len; digit++){
			count += count2sInRangeDigit(num, digit);
		}
		return count;
	}
	
	private int count2sInRangeDigit(int num, int d){
		
		int powerof10 = (int)Math.pow(10, d);
		int nextpowerof10 = 10 * powerof10;
		int right = num % powerof10;
		
		int roundDown = num - num % nextpowerof10;
		int roundUp = roundDown + nextpowerof10;
		
		
		int digit = (num / powerof10) % 10;
		
		if (digit < 2){
			return roundDown / 10;
		}
		
		if (digit > 2){
			return roundUp / 10;
		}
		
		
		else{
			return roundDown / 10 + right + 1;
		}
		
	}

}
