import java.util.Arrays;
import java.util.Scanner;

public class MatrixTestDrive {

	public static void main(String[] args) {
		double[][] hardArray = new double[][] {
			{10, 10, 10, 10},
			{1, 10, 10, 2.1},
			{10, 9.1, 7.3, 11.9}
		};
		
		System.out.println("Input N and M");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println("Input min and max values");
		int min = scan.nextInt();
		int max = scan.nextInt();
		
		if (min>max) {
			min = min ^ max;
			max = min ^ max;
			min = min ^ max;
		}
		scan.close();
		Matrix matrix1 = new Matrix(n, m, min, max);
		System.out.println();
		matrix1.printArray();
		System.out.println("Arithmetic mean: " + matrix1.findArithmeticMean());
		System.out.println("Geometric mean: " + matrix1.findGeometricMean());
		System.out.println("Local minimum: "+Arrays.toString(matrix1.findLocalMin()));
		System.out.println("Transposition: "+ Arrays.deepToString(matrix1.transposition()));

	}

}
