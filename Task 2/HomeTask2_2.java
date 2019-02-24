import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask2_2 {

	public static void main(String[] args) {
		int number = 0;
		int a = 0;
		int b = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (number<1 || a<1 || b<1) {
			try {				
				System.out.println("Input a natural number");				
				number = scan.nextInt();			
				System.out.println("Input a");
				a = scan.nextInt();
				System.out.println("Input b");
				b = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e);
				number = 0;
				a = 0;
				b = 0; //HELP! WHY AFTER REFRESHING THESE VALUES I AGAIN CATCH EXCEPTION IN CYCLE?! 
					   //Just try input not number 
			}
		}
		
		
		System.out.println("Max digit in number is " + findMaxDigit(number));
		System.out.println("number is palindrome? " + isPalindrome(number));
		System.out.println("number is simple? " + isSimple(number));
		System.out.println("Simple dividers: " + simpleDividers(number).toString());
		System.out.println("Count of unique digits: "+uniqueDigitsCount(number));	
		System.out.println("\nLeast common multiple of a and b: "+lcm(a,b));
		System.out.println("Greatest common divisor of a and b: "+gcd(a,b));
		
		scan.close();
	}

	///////////////////////////MAX DIGIT method///////////////////////////
	public static int findMaxDigit(int number) {	
		String numberStr = String.valueOf(number);
		int max = 0;
		int digit = 0;
		for (int i=0; i<numberStr.length(); i++) {
			digit = Integer.parseInt(numberStr.charAt(i)+"");
			if (max < digit) {
				max = digit;
			}
		}
		return max;
	}
	
	///////////////////////////PALINDROME method///////////////////////////
	public static boolean isPalindrome(int number) {
		String numberStr = String.valueOf(number);
		StringBuffer revStr = new StringBuffer(numberStr).reverse();
		if (numberStr.equals(revStr.toString())) {
			return true;
		} else {
			return false;
		}
	}
	
	///////////////////////////SIMPLE method///////////////////////////
	public static boolean isSimple(int number) {
		if (number<=2) {
			return true;
		} else {
			boolean result = true;
			int i = 2;
			while (i<number&&result) {
				if (number%i==0) {
					result = false;
				}
				i++;
			}
			return result;
		}
	}
	
	///////////////////////////SIMPLE DIVIDERS method///////////////////////////
	public static ArrayList<Integer> simpleDividers(int number) {		
		ArrayList<Integer> result = new ArrayList<Integer>(); //i know, that i can't use arrays, but what i should return here?
		for (int i=1; i<=number; i++) {
			if (number%i==0) {
				if (isSimple(i)) {
					result.add(i);
				}
			}
		}
		return result;
	}
	
	///////////////////////////find GCD///////////////////////////
	public static int gcd(int a, int b) {
		int gcd = 0;
		int smallest = a<b? a:b;
		while (gcd==0) {
			if (a%smallest==0 && b%smallest==0) {
				gcd = smallest;
			}
			smallest--;
		}
		return gcd;
	}
	
	///////////////////////////find LCM///////////////////////////
	public static int lcm(int a, int b) {
		int lcm = 0;
		int biggest = a>b? a:b;
		while (lcm==0) {
			if (biggest%a==0 && biggest%b==0) {
				lcm = biggest;
			}
			biggest++;
		}
		return lcm;
	}
	
	///////////////////////////count of unique digits///////////////////
	public static int uniqueDigitsCount(int number) {
		String numberStr = String.valueOf(number);
		HashSet digits = new HashSet();  //I know, that it's wrong, but i think, that it's interesting solution
		for (int i=0; i<numberStr.length(); i++) {
			digits.add(numberStr.charAt(i));
		}
		return digits.size(); 
	}
}
