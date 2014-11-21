package chapter1;

public class Q5 {

	public String compressString(String str){
		
		if (str == null || str.length() == 0){
			return str;
		}
		
		StringBuilder sb = new StringBuilder();
		int N = str.length();
		int count = 1;
		
		for (int i = 1; i < N; i++){
			
			if (str.charAt(i) == str.charAt(i - 1)){
				count++;
			}
			
			else{
				sb.append(str.charAt(i - 1));
				sb.append(count);
				count = 1;
			}
		}
		
		sb.append(str.charAt(N - 1));
		sb.append(count);
		
		if (sb.length() > str.length()){
			return str;
		}
		
		else{
			return sb.toString();
		}
		
	}
	
	public static void main(String[] argv){
		
		String str = "abccd";
		Q5 test = new Q5();
		String res = test.compressString(str);
		System.out.println(res);
		
		
	}
	
}
