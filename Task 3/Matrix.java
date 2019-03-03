import java.util.Arrays;
import java.util.Random;

public class Matrix {
	private double[][] matrix; 
	
	/////////////////////////////CONSTRUCTORS//////////////////////////
	public Matrix(double[][] arr) {
		matrix = arr;
	}
	
	public Matrix(int n, int m, int min, int max) {
		matrix = new double[n][m];		
		this.fillArray(matrix, min, max);
	}
	
	///////////////////////////METHODS//////////////////////
	
	/////////////////////////printArray/////////////////////
	public void printArray() { //absent block-scheme
		System.out.println(Arrays.deepToString(matrix));
	}
	
	/////////////////////////FillArray///////////////////////////
	public double[][] fillArray(double[][] arr, int min, int max) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = min + (max - min) * rand.nextDouble();
			}
		}
		return arr;
	}
	
	/////////////////////////FINDMAX////////////////////////
	public double findMax() {
		double max = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}
	
	///////////////////////FINDMIN////////////////////////
	public double findMin() {
		double min = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
		}
		return min;
	}
	
	//////////////////////FindArithmeticMean////////////////////////
	public double findArithmeticMean() {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {				
				sum+=matrix[i][j];
			}
		}
		return sum/(matrix.length*matrix[0].length);
	}
	
	//////////////////////FindGeometricMean////////////////////////
	public double findGeometricMean() {
		double multy = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {				
				multy*=matrix[i][j];
			}
		}
		if (multy<0) {
			System.out.println(("Multy of array < 0. Geometric Mean isn't exist. Return 0,0"));
			return 0;
		} else {
			return Math.pow(multy, 1./(matrix.length*matrix[0].length));
		}
	}
	
	//////////////////////FindLocalMin////////////////////////
	public int[] findLocalMin() {
		boolean positionFound = false;		
		int[] result = new int[2];
		
		for (int i = 0; i < matrix.length && !positionFound; i++) {
			for (int j = 0; j < matrix[0].length && !positionFound; j++) {
				double min = matrix[i][j];
				boolean up = false;
				boolean down = false;
				boolean left = false;
				boolean right = false;
				
				if (//if not corner
					(i!=0||j!=0)&&  
					(i!=0||j!=matrix[0].length-1)&&
					(i!=matrix.length-1||j!=0)&&
					(i!=matrix.length-1||j!=matrix[0].length-1)
					) {	
					
					if (i!=0) {	
						up = min<matrix[i-1][j];
					}
					if (i!=matrix.length-1) {
						down = min<matrix[i+1][j];
					}
					if (j!=matrix[0].length-1) {
						right = min<matrix[i][j+1];
					}
					if (j!=0) {
						left = min<matrix[i][j-1];
					}				
				
					up = i==0? true : up;
					down = i==matrix.length-1? true : down;
					right = j==matrix[0].length-1? true : right;
					left = j==0 ? true : left;
				
					if (up&&down&&left&&right) {
						positionFound = true;
						result[0] = i;
						result[1] = j;
					}
				}
			}
		}
			
		if (result[0]==0 && result[1]==0) {
			System.out.println("This matrix hasn't local minimum. Return -1,-1");
			result[0] = -1;
			result[1] = -1;
		}		
		return result;
	}
	
	//////////////////////Transposition///////////////////////////
	public double[][] transposition() {
		double[][] transpos = new double[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				transpos[j][i] = matrix[i][j];
			}
		}
		return transpos;
	}
}
