import java.util.Scanner;
public class TwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int Number1;
		int Number2;
		int sum; //sum of number1 and number2
		int difference; //difference of number1 and number2
		int product; //product of number1 and number2
		int quotient; //quotient of number1 and number2
		
	System.out.print( "enter a number: ");
	
	Number1 = input.nextInt();
	
	System.out.print( "Now enter another number: ");
	Number2 = input.nextInt();
	
	sum = Number1 + Number2;
	difference = Number1 - Number2;
	product = Number1 * Number2;
	quotient = Number1 / Number2;
	
			
	System.out.printf( "The sum  is %d.\n"
			+ "The difference is %d.\n"
			+ "The quotient is %d.\n"
			+ "The product is %d.", sum, difference, quotient, product);
	
	}
}
