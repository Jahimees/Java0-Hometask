import java.util.Scanner;

public class HomeTask1_2Updated {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int kg = scan.nextInt();
		
		double t = kg/1000.0;
		int g = kg*1000; //Argentinosaurus - the biggest dinosaur(108 tonnes).Type int is optional.
		long mg = g*1000L;
		
		
		System.out.println("dinosaur in kilograms: "+kg);
		System.out.println("tons = " + t);
		System.out.println("Grams = " + g );
		System.out.println("milligrams = " + mg);
	}
}
