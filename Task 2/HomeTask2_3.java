import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = 0;
		Scanner scan = new Scanner(System.in);
	
		try {		
			
			while (number<1) {
			System.out.println("Input a natural number");
			number = scan.nextInt();			
			}
		} catch (InputMismatchException e) {
			System.out.println("It sould be a number");
		}
		
		System.out.print("this number is perfect? "+isPerfectNumber(number));
			
	}

	public static boolean isPerfectNumber(int number) {
		int sum=0;
		for (int i=1; i<number; i++) {
			if (number%i==0) {
				sum+=i;
			}
		}
		if (sum==number) {
			return true;
		} else {
			return false;
		}
	}
}
