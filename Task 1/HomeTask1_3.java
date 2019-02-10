import java.util.Scanner;

public class HomeTask1_3 {

	//3. �� ��������� ���� ��� ����� � ����� ������� � ��������� R1 � R2 (R1>R2). ������������ ��������� ���������� ������� ������, ������� ������
	//�������� ����� R1, � ���������� ������ ����� R2.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double r1 = scan.nextInt();
		double r2 = scan.nextInt();
		final double pi = Math.PI;
		
		if (r2>r1) {
			r1 = (double) r1+r2;
			r2 = (double) r1-r2;
			r1 = (double) r1-r2;
		}
		
		double s1 = pi*Math.pow(r1, 2);
		double s2 = pi*Math.pow(r2, 2);
		double s3 = s1 - s2;
		
		System.out.println("Ring Square: "+s3);
		
	}
}
