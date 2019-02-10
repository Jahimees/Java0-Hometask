import java.util.Scanner;

public class HomeTask1_5 {

	//Написать программу, которая находит арифметическое и геометрическое
	//среднее цифр шестизначного числа N.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[6];
		int d1 = 100_000;
		int d2 = 10;
		int sum = 0;
		int multi = 1;
		int x;
		do {
			x = scan.nextInt();
		}
		while (x>999_999||x<100_000);
		
		for	(int i=0; i<num.length; i++) {
			num[i] = (x/d1)%d2;
			d1/=10;
			sum+=num[i];
			multi*=num[i];
		}
		double arithm = (double) sum/num.length;
		double geom = (double) Math.pow(multi, (double) 1/num.length);
		System.out.println("average arithmetic: " + arithm);
		System.out.println("average geometric: "+ geom);			
		}
}