package chapter17;

public class Q3 {
	
	public int countFactZeros(int n){
		
		int count = 0;
		if (n < 0){
			return -1;
		}
		
		for (int i = 5; i < n / i; i*=5){
			count += n / i;
		}
		
		return count;
	}

}
