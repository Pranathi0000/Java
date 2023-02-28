
// java program to swap two values without the use of 3rd variable.

package intro;

import java.util.Scanner; // importing scanner class from java.util package used to read input from user

public class SwappingWithoutOtherVariable {

	public static void main(String[] args) {
	
        Scanner Obj=new Scanner(System.in); // creates an object of Scanner class
        
        System.out.println("Enter the numbers: ");
        
        // takes input from the keyboard
        
        int number1=Obj.nextInt();
        int number2=Obj.nextInt();
        
        //Swapping without 3rd variable
        
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        
        //displaying results after swapping
        
        System.out.println(number1);
        System.out.println(number2);

	}

}
