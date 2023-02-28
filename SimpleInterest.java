
/*
    Program to calculate simple interest when principal amount,rate of interest,time period are given.
 */

package intro;

import java.util.Scanner; // importing scanner class from java.util package used to read input from user

public class SimpleInterest {
       public static void main(String[] args) {
    	    
           Scanner Obj=new Scanner(System.in); // creates an object of Scanner class
           
           //taking the inputs from user
           
           System.out.println("Enter the Principal Amount:");
           int principalAmount=Obj.nextInt();
           
           System.out.println("Enter time period:");
           int time=Obj.nextInt();
           
           System.out.println("Enter the rate of interest:");
           float rateOfInterest=Obj.nextFloat();
           
           //Simple Interest
           double simpleInterest=(principalAmount*time*rateOfInterest)/100;
           
           //printing SimpleInterest
           System.out.print("Simple Interest: ");
           System.out.printf("%.2f",simpleInterest);
       }
}
