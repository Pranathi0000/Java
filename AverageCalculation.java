/*
    A teacher wants to compute the average of 5 students in her class. Write a program to help her to find the average.
    The average is the sum of all the numbers, then divided by the total numbers.
 */

package intro;

import java.util.Scanner;// importing scanner class from java.util package used to read input from user

public class AverageCalculation {

	public static void main(String[] args) {

        Scanner Obj=new Scanner(System.in);// creates an object of Scanner class
        
          System.out.println("Enter the marks: ");
        
        // takes input from the keyboard
        
        float Student1=Obj.nextFloat();
        float Student2=Obj.nextFloat();
        float Student3=Obj.nextFloat();
        float Student4=Obj.nextFloat();
        float Student5=Obj.nextFloat();
        
        //Average 
        
        double average=( Student1+Student2+Student3+Student4+Student5)/5;
        
        System.out.print("Average is: ");
        System.out.printf("%.2f",average);

	}

}
