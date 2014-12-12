package chapter18;

public class Q11 {
	
	private static final int BLACK = 1;
	//private static final int WHITE = 0;
	
	public static class SquareCell{
		
		int zerosRight;
		int zerosBelow;
		
		public SquareCell(int right, int below){
			zerosRight = right;
			zerosBelow = below;
		}
	}
	
	public static class SubSquare{
		int row;
		int col;
		int size;
		
		public SubSquare(int row, int col, int size){
			this.row = row;
			this.col = col;
			this.size = size;
		}
	}
	
	
	public SubSquare findSquare(int[][] matrix){
		
		SquareCell[][] processed = process(matrix);
		
		int N = processed.length;
		
		for (int i = N; i >= 1; i-- ){
			
			SubSquare square = findSquareWithSize(processed, i);
			if (square != null){
				return square;
			}
			
		}
		
		return null;
	}
	
	private SquareCell[][] process (int[][] matrix){
		
		int N = matrix.length;
		
		SquareCell[][] processed = new SquareCell[N][N];
		
		for (int i = N - 1; i >= 0; i--){
			for (int j = N - 1; j >= 0; j--){
				
				int zerosRight = 0;
				int zerosBelow = 0;
				
				if (matrix[i][j] == BLACK){
					zerosRight++;
					zerosBelow++;
					
					if (j < N - 1 && matrix[i][j + 1] == BLACK){
						zerosRight = processed[i][j + 1].zerosRight + 1;
					}
					
					if (i < N - 1 && matrix[i + 1][j] == BLACK){
						zerosBelow = processed[i + 1][j].zerosBelow + 1;
					}
					
					
				}
				
				processed[i][j] = new SquareCell(zerosRight, zerosBelow);
				
			}
		}
		
		return processed;
		
	}
	
	
	private SubSquare findSquareWithSize(SquareCell [][] processed, int size){
		
		int N = processed.length;
		int count = N - size;
		
		for (int i = 0; i < count; i++){
			for (int j = 0; j < count; j++){
				if (isSquare(processed, i, j, size)){
					return new SubSquare(i, j, size);
				}
			}
		}
		
		return null;
		
	}
	
	private boolean isSquare(SquareCell[][] processed, int row, int col, int size){
		
		SquareCell topLeft = processed[row][col];
		SquareCell topRight = processed[row][col + size - 1];
		SquareCell bottomLeft = processed[row + size - 1][col];
		
		if (topLeft.zerosBelow < size || topLeft.zerosRight < size){
			return false;
		}
		
		if (topRight.zerosBelow < size){
			return false;
		}
		
		if (bottomLeft.zerosRight < size){
			return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] argv){
		
		int[][] matrix = {{0, 1, 0, 1}, {1, 1, 1, 0}, {1, 1, 0, 0}, {0, 1, 1, 0}};
		
		Q11 test = new Q11();
		SubSquare square = test.findSquare(matrix);
		System.out.println("row: " + square.row);
		System.out.println("col: " + square.col);
		System.out.println("size: " + square.size);
	}

}
