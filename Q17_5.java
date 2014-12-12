package chapter17;

public class Q5 {
	
	public class Results{
		
		public int hits = 0;
		public int pHits = 0;
		
		public String toString(){
			return " ( " + hits + " , " + pHits + " ) ";
		}
		
	}

	
	public Results guessSlots(String solution, String guess){
		
		int N = solution.length();
		Results res = new Results();
		
		if (guess == null || guess.length() != N){
			System.out.println("wrong guess format");
			return res;
		}
		
		int[] mem = new int[N];
		
		for (int i = 0; i < N; i++){
			if (solution.charAt(i) == guess.charAt(i)){
				res.hits++;
			}
			
			else{
				
				int code = code(solution.charAt(i));
				if (code != -1){
					mem[code]++;
				}
				
			}
		}
		
		for (int i = 0; i < N; i++){
			
			if (solution.charAt(i) == guess.charAt(i)){
				continue;
			}
			
			int code = solution.charAt(i);
			
			if (code != -1 && mem[code] > 0){
				res.pHits++;
				mem[code]--;
			}
		}
		
		return res;
		
	}
	
	private int code(char c){
		
		if (c == 'B') return 0;
		if (c == 'G') return 1;
		if (c == 'R') return 2;
		if (c == 'Y') return 3;
		else{
			return -1;
		}
		
	}
}
