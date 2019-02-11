/**
 * @author Mohammed kadiri
 * Write a short Java method, isEven, that takes an int i and returns true if and only
 *  if i is even. Your method cannot use the multiplication, modulus, or division
 *  operators, however.
 */
import java.util.Scanner;

public class isEven {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to test if it is an even number: ");
		int num = input.nextInt();
		
		if(isEven(num)) {
			System.out.println("The number " + num + " is even." );
		}
		else {
			System.out.println("The number " + num + " is odd." );
		}
	}
	/**
	 *
	 * @param num
	 * @return true if the num is even otherwise return false
	 */
	public static boolean isEven(int num) {
		if((num & 1) == 0) { // If the last digit of a number is zero when AND with 1 
			return true;
		}
		else {
			return false;
		}
	}

}