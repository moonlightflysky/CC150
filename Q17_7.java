package chapter17;

public class Q7 {
	
	public String[] digits = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	public String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
	"Nineteen"};
	public static String[] tens = {"Ten", "Twenty", "Thirty", "Forty",
	"Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	public static String[] bigs = {"", "Thousand", "Million"};
	
	
	public String intToString(int num){
		
		if (num == 0){
			return "zero";
		}
		
		if (num < 0){
			return "negative" + intToString( -num);
		}
		
		StringBuilder res = new StringBuilder();
		int cnt = 0;
		
		while (num > 0){
			
			if (num % 1000 != 0){
				res.insert(0, " ");
				res.insert(0, bigs[cnt]);
				res.insert(0, intToString100(num % 1000));
			}
			
			num = num / 1000;
			cnt++;
		}
		
		return res.toString();
		
	}
	
	private String intToString100(int num){
		
		StringBuilder res = new StringBuilder();
		
		if (num >= 100){
			int digit = num/100;
			num = num%100;
			res.append(digits[digit - 1]);
			res.append(" ");
			res.append("hundred");
		}
		
		if (num > 10 && num < 20){
			
			res.append(" ");
			res.append(teens[num - 11]);
		}
		
		else if (num >= 20 || num == 10){
			
			int digit = num / 10;
			num = num % 10;
			res.append(" ");
			res.append(tens[digit - 1]);
		}
		

		
		if (num >=1 && num <= 10){
			res.append(" ");
			res.append(digits[num - 1]);
		}
		return res.toString();
		
	}
	

}
