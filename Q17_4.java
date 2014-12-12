package chapter17;

public class Q4 {
	
	public int maxOf(int a, int b){
		
		int signA = signOf(a);
		int signB = signOf(b);
		
		int c = a - b;  // we don't mind if c is over flow or not, if a and b's sign different we do not use c,
		// if a and b's sign same, c is sure to be not overflow
		
		int signC = signOf(c);
		
		
		int k1 = (signA ^ signB) * signA + flip(signA ^ signB) * signC;
		int k2 = flip(k1);
		
		
		return a * k1 + b * k2;
	}
	
	private int flip(int bit){
		return 1 ^ bit;
	}
	
	public int signOf(int a){
		return flip((a >> 31) & 0x1);
	}
	
	
	public static void main(String[] argv){
		
		int a = 0, b = 100;
		
		Q4 test = new Q4();
		int res = test.maxOf(a, b);
		System.out.println(res);
	}

}
