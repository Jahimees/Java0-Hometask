import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeTask2_1 {

	public static void main(String[] args) {
		int heads=0;
		int tails=0;
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input count of tosses");
		try {
			count = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("It should be a number");
		}
		
		for (int i=0; i<count; i++) {
			Random rand = new Random();
			if (rand.nextInt(2)==1) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Heads: "+heads+";");
		System.out.println("Tails: "+tails+";");
	}

}
