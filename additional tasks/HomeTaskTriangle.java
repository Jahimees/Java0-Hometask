import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class HomeTaskTriangle {
	
	public static void main(String[] args) {
		System.out.println("Input 3 pairs of coords (x1,y1,x2,y2...)");
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextInt();
		double y1 = scan.nextInt();
		double x2 = scan.nextInt();
		double y2 = scan.nextInt();
		double x3 = scan.nextInt();
		double y3 = scan.nextInt();
		
		if ((x1==x2&&y1==y2)||(x1==x3&&y1==y3)||(x2==x3&&y2==y3)) {
			System.out.println("Triangle doesn't exist");
		} else {
			///////////////////////finding k and b///////////////////
			double k1 = (double)(y2-y1)/(x2-x1);		
			double k = new BigDecimal(k1).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
			double b1 = y1-x1*k;
			double b = new BigDecimal(b1).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
			
			System.out.println("k = "+k);
			System.out.println("b = "+b);
		
			if (y3==k*x3+b) 
			{
				System.out.println("Triangle doesn't exist!");
			} else {
				System.out.println("Triangle exist!");
				double l1 = (double) (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
				System.out.println("L1 = "+l1);
				double l2 = (double) (Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
				System.out.println("L2 = "+l2);
				double l3 = (double) (Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
				System.out.println("L3 = "+l3);
			
				if (l1==l2+l3) {
					System.out.println("It's right triangle");
				} else {
					if (l2==l1+l3) {
						System.out.println("It's right triangle");
					} else {
						if (l3==l1+l2) {
							System.out.println("It's right triangle");
						} else {
							System.out.println("It's not right triangle");
						}
					}
				}
			}
		}
	}
}