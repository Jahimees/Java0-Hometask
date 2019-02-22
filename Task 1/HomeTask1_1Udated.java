import java.util.Scanner;

public class HomeTask1_1Updated {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input numbers a, b, and c");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a==b&&a==c)	{
			System.out.println("All numbers are equal");			
		} else {
			if (a!=b && a!=c && b!=c) {
				System.out.println("All numbers are not equal");
			} else {
				if (a==b) {
					System.out.println("numbers a and b are equal");
				} else {
					if (a==c) {
						System.out.println("numbers a and c are equal");						
					} else {
						System.out.println("numbers b and c are equal");
					}
				}
			}
		}
		
		

	}

}