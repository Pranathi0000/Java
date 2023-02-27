/*
   Java program to get 2 numbers from the user and performing arithmetic operations on them
   
   Operations:
   
    Addition	  +			Adds one operand to the other
    Subtraction	  -			Subtracts the second operand from the first
	Multiplication	*		Multiplies one operand by the other
	Division	   /		Divides the first operand by the second
	Modulo	       %		Divides the first INTEGER operand by the second, and returns the remainder
	
 */

package intro;

import java.util.Scanner; // importing scanner class from java.util package used to read input from user

public class ArithmeticOperators {

	public static void main(String[] args) {
		
        Scanner obj=new Scanner(System.in); // creates an object of Scanner class
		
		System.out.println("Enter the first number: "); //displays the text enter the first number: 

		int number1=obj.nextInt(); // takes input from the keyboard
		
		System.out.println("Enter the second number: "); //displays the text enter the second number: 

		int number2=obj.nextInt(); // takes input from the keyboard
       
		//Addition
		int sum=number1+number2; //sum variable has the value after adding number1 & number2
		
		//subtraction
		int difference=number1-number2; //difference  variable has the value after subtracting number2 from  number1
		
		//multiplication
		int product=number1*number2; //product  variable has the value after multiplying number1 & number2
		
		//Division
		int division=number1/number2; //division  variable has the value after dividing number1 with number2
		
		//Modulo
		int mod=number1%number2; // mod variable has the value of remainder after dividing number1 with number2
		
		//printing the results
		System.out.println("Addition of "+number1+" and " + number2+" " +"is: "+ sum);
		System.out.println("Difference of "+number1+" and " + number2+" " +"is: "+difference );
		System.out.println("Multiplication of "+number1+" and " + number2+" " +"is: "+product );
		System.out.println("Division of "+number1+" and " + number2+" " +"is: "+division );
		System.out.println("Modulus of "+number1+" and " + number2+" " +"is: "+mod );
	}

}
