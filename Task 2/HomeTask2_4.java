
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask2_4 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner scan = new Scanner(System.in);
	
		try {		
			
			while (a<1||b<1) {
			System.out.println("Input a start point a");
			a = scan.nextInt();		
			System.out.println("Input a end point b");
			b = scan.nextInt();		
			}
		} catch (InputMismatchException e) {
			System.out.println("It sould be a number");
		}
		
		System.out.println("Friendly numbers: ");
		friendlyNumbers(a,b);
			
	}

	public static void friendlyNumbers(int a, int b) {
		int sumX=0;
		int sumY=0;
		//how i can optimize this?
		for (int i=a; i<b; i++) {
			for (int j=a; j<b; j++) {
				for (int x=1; x<j; x++) {
					if (j%x==0) {
						sumY+=x;
					}
				}				
				for (int y=1; y<i; y++) {
					if (i%y==0) {
						sumX+=y;
					}
				}
				if (i!=j) {
					if (sumX==j&&sumY==i) {
						System.out.println(i + " and " + j);
					}
				}
				sumX=0;
				sumY=0;
			}			
		}
	}
}