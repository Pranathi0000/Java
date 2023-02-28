/*
 Write a java program to get 2 numbers from the user and swap their values without any loss of data. 
 You can make use of additional 3rd variable for swapping
 */

package intro;

import java.util.Scanner; // importing scanner class from java.util package used to read input from user

class Swapping
{
    public static void main(String args[])
    {
        Scanner Obj=new Scanner(System.in);// creates an object of Scanner class
        
        System.out.println("Enter the numbers: ");
        
        // takes input from the keyboard
        
        int number1=Obj.nextInt();
        int number2=Obj.nextInt();
        
        //swapping
        
        int tempVar=number1;
        number1=number2;
        number2=tempVar;
        
        //displaying values after swapping
        
        System.out.println(number1);
        System.out.println(number2);
    }
}