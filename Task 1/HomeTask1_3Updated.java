import java.util.Scanner;

public class HomeTask1_3Updated {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input values r1 and r2");
		double r1 = scan.nextDouble();
		double r2 = scan.nextDouble();
		final double pi = Math.PI;
		
		if (r2>r1) {
			System.out.println("r2>r1! Swapping values...");
			r1 = r1+r2;
			r2 = r1-r2;
			r1 = r1-r2;
		}
		
		double s = Math.PI*(Math.pow(r1, 2) - Math.pow(r2, 2));
		
		System.out.println("Ring Square: "+s);
		

	}

}
