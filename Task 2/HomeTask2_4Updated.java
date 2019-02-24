
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask2_4Updated {

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
		
		if (a>b) {
			a = a^b;
			b = a^b;
			a = a^b;
		}
		
		System.out.println("Friendly numbers: ");
		friendlyNumbers(a,b);
			
	}

	public static void friendlyNumbers(int a, int b) {
		int sumX=0;
		int sumY=0;
		int i = a;
		while (i<b) {
			sumX = sumDivisors(i);
			if (sumX>a && sumX<b) {
				for (int j=a; j<i; j++) {								
					if (sumX==j&&i!=j) {
						sumY = sumDivisors(sumX);
						if (sumY==i) {
							System.out.println(i + " and " + j);
						}
					}					
				}				
			}
			i++;
		}
	}
	
	public static int sumDivisors(int i) {
		int sum = 0;
		for (int x=1; x<i; x++) {
			if (i%x==0) {
				sum+=x;
			}
		}	
		return sum;
	}
}