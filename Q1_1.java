package chapter1;

public class Q1 {
	
	public boolean isUniqueChars(String str){
		
		int checker = 0;
		
		int N = str.length();
		
		for (int i = 0; i < N; i++){
			int c = str.charAt(i) - 'a';
			System.out.println(c);
			if ((checker & (1 << c)) > 0){
				return false;
			}
			
			else{
				checker |= (1 << c);
			}
		}
		
		return true;
	}
	
	public static void main(String[] argv){
		
		String str = "doublerde";
		Q1 test = new Q1();
		boolean res = test.isUniqueChars(str);
		System.out.println(res);
	}

}
