package chapter5;

public class Q2 {
	
	public String decimalToBinary(double num){
		
		if (num >= 1 || num <= 0){
			return "ERROR";
		}
		
		
		StringBuilder res = new StringBuilder();
		res.append(".");
		
		while (num > 0){
			
			if (res.length() >= 32){
				return "ERROR";
			}
			
			double r = num * 2;
			
			if (r >= 1){
				num = r - 1;
				res.append("1");
			}
			
			else{
				num = r;
				res.append("0");
			}
			
		}
		
		return res.toString();
		
	}
	
	public static void main(String[] argv){
		
		Q2 test = new Q2();
		double a = 0.0078125 + 0.375;
		String res = test.decimalToBinary(a);
		System.out.println(res);
		
	}

}
