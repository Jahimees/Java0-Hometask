import java.util.Scanner;

public class HomeTask1_4Updated {
	
	public static void main(String[] args) {
		String num;
		boolean up = true;
		boolean down = true;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input 4-digits number");
		int x = scan.nextInt();	
		while (x>9999||x<1000) {
			x = scan.nextInt();
		}
		num = Integer.toString(x);
			
		
		for	(int i=0; i<num.length()-1; i++) {
			if (num.charAt(i)>num.charAt(i+1)) {				
			} else {
				down = false;
			}
			if (num.charAt(i)<num.charAt(i+1)) {				
			} else {
				up = false;
			}			
		}
		
		if (up==true) {
			System.out.println("The digits of the number form an increasing sequence");
		} else {
			if (down==true) {
				System.out.println("The digits of the number form a decreasing sequence");
			} else {
				System.out.println("Numbers do not form a sequence");
			}
		}	
	}
}