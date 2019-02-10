import java.util.Scanner;

public class HomeTask1_4 {

	//Разработайте программу, которая проверяет, что цифры четырёхзначного
	//числа N образуют возрастающую (убывающую) последовательность (к примеру,
	//число 1357 удовлетворяет условию, т.к. его цифры соответствуют следующему
	//неравенству: 1 < 3 < 5 < 7, т.е. идут в порядке возрастания).
	
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
		for	(int i=0; i<num.length-1; i++) {
			if (num[i]>num[i+1]) {				
			} else {
				down = false;
			}
			if (num[i]<num[i+1]) {				
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