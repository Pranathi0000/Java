/*
  Write a program to get a character as input and print it's ASCII value.

When a character is entered, the character itself is not stored. Instead, a numeric value(ASCII value) is stored.

 */
package intro;

import java.util.Scanner; // importing scanner class from java.util package used to read input from user

public class ASCII {

	public static void main(String[] args) {
		
	     Scanner Obj=new Scanner(System.in); // creates an object of Scanner class
	     
	     char word=Obj.next().charAt(0); //takes input from the keyboard
	     
	     //charAt(0) -- reads the character at 0 from the user
	     
	     System.out.println((int)word); // prints the integer value of the word according to the unicode

	}

}
