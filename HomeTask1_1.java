import java.util.Scanner;

public class HomeTask1_1 {

	1. Разработайте программу, которая проверяет, что числа a, b и c различны (одинаковы).
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a==b&&a==c)	{
			System.out.println(Все числа равны);			
		} else {
			if (a!=b && a!=c && b!=c) {
				System.out.println(Все числа различны);
			} else {
				if (a==b) {
					System.out.println(Числа a и b равны);
				} else {
					if (a==c) {
						System.out.println(Числа a и c равны);						
					} else {
						System.out.println(Числа b и c равны);
					}
				}
			}
		}

	}

}
