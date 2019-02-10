import java.util.Scanner;

public class HomeTask1_2 {

	//2. Масса динозавра задаётся в килограммах. Разработайте программу, которая вычисляет, сколько это миллиграмм, грамм и тонн.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int kg = scan.nextInt();
		
		double t = (double) kg/1000;
		int g = kg*1000; //Argentinosaurus - the biggest dinosaur(108 tonnes).Type int is optional.
		long mg = (long) g*1000;
		
		
		System.out.println("dinosaur in kilograms: "+kg);
		System.out.println("tons = " + t);
		System.out.println("Grams = " + g );
		System.out.println("milligrams = " + mg);
	}
}
