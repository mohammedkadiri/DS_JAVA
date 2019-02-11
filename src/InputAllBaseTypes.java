
/**
 * 
 * @author Mohammed kadiri
 * Write a short Java method, inputAllBaseTypes, that inputs a different value of
*  each base type from the standard input device and prints it back to the standard
*  output device.
*
*/

import java.util.Scanner;



public class InputAllBaseTypes {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		inputAllBaseTypes();
		
		

	}
	
	
	public static void inputAllBaseTypes() {
		
		System.out.println("Enter a byte -128 to 127: ");
		byte aByte = input.nextByte();
		
		System.out.println("Enter a short -32,768 to 32, 767: ");
		short aShort = input.nextShort();
		
		System.out.println("Enter a int -2,147,483,648 to 2,147,483,647: ");
		int aInt = input.nextInt();
		
		System.out.println("Enter a long  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80: ");
		long aLong = input.nextLong();
		
		System.out.println("Enter a float ±3.40282347E+38F: ");
		float aFloat = input.nextFloat();
		
		System.out.println("Ente a double 16bytes: ");
		double aDouble = input.nextDouble();
		
		
		System.out.println("The value of the byte entered" + aByte);
		
		System.out.println("The value of the short entered " + aShort);
		
		System.out.println("The value of the int entered: " + aInt);
		
		System.out.println("The value of the long entered: " + aLong);
		
		System.out.println("The value of the float entered: " + aFloat);
		
		System.out.println("The value of the double entered: " + aDouble);
		
	}

}
