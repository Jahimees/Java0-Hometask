import java.util.Scanner;

public class HomeTask1_7 {

	//������������ ��������� ������� ���������, ������� ������ �������
	//���������� ���� ������������� ���������� a � b, �� ��������� ��� �����
	//�������������� ����������.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;		
		int y;
				
		System.out.print("x = ");
		x = scan.nextInt();
		System.out.print("y = ");
		y = scan.nextInt();
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);							
		}
}
