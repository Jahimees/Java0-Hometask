import java.util.Scanner;

public class HomeTask1_6 {

	//Написать программу, которая переворачивает (реверсирует) семизначное
	//число N (к примеру, число 1234567 реверсируется в число 7654321).
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer x;
		do {
			x = scan.nextInt();
		}
		while (x>9_999_999||x<1_000_000);
		
		char[] numInChar = x.toString().toCharArray();
		String reversedNumS="";
		
		for (int i=numInChar.length-1; i>=0; i--) {
			reversedNumS+=numInChar[i];
		}
		
		int reversedNum = Integer.parseInt(reversedNumS);
		System.out.println(reversedNum);					
		}
}
