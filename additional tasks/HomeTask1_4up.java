import java.util.Scanner;

public class HomeTask1_4up {
	
	public static void main(String[] args) {
		int[] num = new int[4];
		boolean up = true;
		boolean down = true;
		int d1=1000;
		int d2=10;
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while (x>9999||x<1000) {
			x = scan.nextInt();
		}
		for	(int i=0; i<num.length; i++) {
			num[i] = (x/d1)%d2;
			d1/=10;
			d2=10;
		}
		int counter = 0;
		while ((down || up) && counter<=2) {
					
			if (num[counter]>num[counter+1]) {				
			} else {
				down = false;
			}
			if (num[counter]<num[counter+1]) {				
			} else {
				up = false;
			}
			counter++;
			//Не знаю, как ещё можно было сделать..
		}
		
		if (up) {
			System.out.println("The digits of the number form an increasing sequence");
		} else {
			if (down) {
				System.out.println("The digits of the number form a decreasing sequence");
			} else {
				System.out.println("Numbers do not form a sequence");
			}
		}	
	}
}