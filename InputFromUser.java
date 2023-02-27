// program  to get an integer,string,float as input and print them.

package intro;

import java.util.Scanner; // importing scanner class from java.util package used to read input from user

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in); // creates an object of Scanner class
		
		System.out.println("Enter the number: "); //displays the text enter the number: 

		int number=obj.nextInt(); // takes input from the keyboard
		
		 //nextInt() -- reads an integer value from the user
		
		System.out.println("Enter name: "); //displays the text enter  name:
		
		String name=obj.next(); // takes input from the keyboard
		
		// next() ---reads a word from the user
		
		System.out.println("Enter a float number: ");//displays the text enter a float number:
		
		float floatValue = obj.nextFloat(); // takes input from the keyboard
		
		//nextFloat() -- reads an float value from the user
	}

}
