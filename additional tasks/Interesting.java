public class Interesting {

	public static void main(String[] args){

		System.out.println("����� 1 � �������� ����� �� 31 ���: ");		
		int y = 1<<31;
		System.out.println(y);

		System.out.println("������ ����� ����������� int: ");		
		int x = -2147483648;
		System.out.println(x);

		System.out.println("");
		System.out.println("����� ������ ���������");		
		System.out.println("");

		System.out.println("�� ���� ��� �������� ������ (����� �� ����� ����������),\n �������� �������");
		System.out.println("�� �� ������� ������ ���������� ���������: ");

		y = 1<<31+1;
		System.out.println("y = 1<<31+1 = "+y);
		System.out.println("���� �� �� ������ ������� �������, �� �� � �������:");

		x = -2147483648+1;
		System.out.println("-2147483648+1 = "+x);
	}



}