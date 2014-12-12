package chapter5;

public class Q3 {
	
	public int getNext(int num){
		
		int R = 32;
		int i = 0;
		int ind = 1;
		int c1 = 0;
		//int c0 = 0;
		
		while (i < R && ((num & ind) == 0)){
			ind = ind << 1;
			i++;
			//c0++;
		}
		
		while (i < R && ((num & ind) != 0)){
			ind = ind << 1;
			i++;
			c1++;
		}
		
		if (i == R){
			return -1; 
		}
		
		num |= 1 << i ;
		num &= ~((1 << i) - 1);
		num += (1 << (c1 - 1)) - 1;
		
		return num;
		
	}
	
	
	public static void main(String[] argv){
		
		Q3 test = new Q3();
		
		int num = Integer.parseInt("10110011110000", 2);
		int res = test.getNext(num);
		System.out.println(Integer.toBinaryString(res));
		
		
	}

}
