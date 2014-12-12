package chapter5;

public class Q6 {
	
	public int swapOddEvenBits(int n){
		
		return (((n & 0xaaaaaaaa) >> 1) | ((n & 0x55555555) << 1));
		
	}
	
	
	public static void main(String[] argv){
		
		Q6 test = new Q6();
		int n = Integer.parseInt("100100100" ,2);
		int res = test.swapOddEvenBits(n);
		System.out.println(Integer.toBinaryString(res));
		
	}
}
