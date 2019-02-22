import java.util.Scanner;

public class HomeTask1_5Updated {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num;
		int sum = 0;
		int multi = 1;
		int x;
		
		System.out.println("Input 6-digits number");
		do {
			x = scan.nextInt();
		}
		while (x>999_999||x<100_000);
		num = String.valueOf(x);
		
		
		for	(int i=0; i<num.length(); i++) {			
			sum+=Integer.parseInt(num.charAt(i)+"");
			multi*=Integer.parseInt(num.charAt(i)+"");
		}
		
		double arithm = (double) sum/num.length();
		double geom = (double) Math.pow(multi, (double) 1/num.length());
		System.out.println("average arithmetic: " + arithm);
		System.out.println("average geometric: "+ geom);
		
		}
}