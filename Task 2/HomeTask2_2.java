import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask2_2 {

	public static void main(String[] args) {
		int number = 0;
		int a = 0;
		int b = 0;
		
		Scanner scan = new Scanner(System.in);
		
		try {		
			
			while (number<1 || a<1 || b<1) {
			System.out.println("Input a natural number");
			number = scan.nextInt();			
			System.out.println("Input a");
			a = scan.nextInt();
			System.out.println("Input b");
			b = scan.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println("It sould be a number");
		}
		
		System.out.println("Max digit in number is " + findMaxDigit(number));
		System.out.println("number is palindrome? " + isPalindrome(number));
		System.out.println("number is simple? " + isSimple(number));
		System.out.print("Simple dividers: ");
		outputSimpleDividers(number);
		System.out.println("\nCount of unique digits: "+uniqueDigitsCount(number));
		System.out.println("\n");		
		System.out.println("Least common multiple of a and b: "+lcm(a,b));
		System.out.println("Smallest common multiple of a and b: "+scm(a,b));
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
	public static void outputSimpleDividers(int number) {		
		for (int i=1; i<=number; i++) {
			if (number%i==0) {
				if (isSimple(i)) {
					System.out.print(i+"; ");
				}
			}
		}
	}
	
	///////////////////////////find LCM///////////////////////////
	public static int lcm(int a, int b) {
		int lcm = 0;
		int smallest = a<b? a:b;
		int i = smallest;
		while (lcm==0) {
			if (a%i==0 && b%i==0) {
				lcm = i;
			}
			i--;
		}
		return lcm;
	}
	
	///////////////////////////find SCM///////////////////////////
	public static int scm(int a, int b) {
		int scm = 0;
		int biggest = a>b? a:b;
		int i = biggest;
		while (scm==0) {
			if (i%a==0 && i%b==0) {
				scm = i;
			}
			i++;
		}
		return scm;
	}
	
	///////////////////////////count of unique digits///////////////////
	public static int uniqueDigitsCount(int number) {
		String numberStr = String.valueOf(number);
		HashSet digits = new HashSet();
		for (int i=0; i<numberStr.length(); i++) {
			digits.add(numberStr.charAt(i));
		}
		return digits.size();
	}
}
