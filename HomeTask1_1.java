import java.util.Scanner;

public class HomeTask1_1 {

	1. ������������ ���������, ������� ���������, ��� ����� a, b � c �������� (���������).
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a==b&&a==c)	{
			System.out.println(��� ����� �����);			
		} else {
			if (a!=b && a!=c && b!=c) {
				System.out.println(��� ����� ��������);
			} else {
				if (a==b) {
					System.out.println(����� a � b �����);
				} else {
					if (a==c) {
						System.out.println(����� a � c �����);						
					} else {
						System.out.println(����� b � c �����);
					}
				}
			}
		}

	}

}
