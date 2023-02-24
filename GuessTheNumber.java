/* Program to create a game 
 
 The game is a guessing the number in this we have to guess the number that was selected by the computer
 for this program the number is between 0-100.
 
 Rules:
 
   you will only have 5 chances to guess the number
   numbers other than 0-100 are not encouraged
   you will loose a chance for one wrong guess
 */

package programs;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {

	public static void main(String[] args) {
         int number,option,RandomNumber,choice,i;
         
         System.out.println("Hey! there Welcome to the game...");
         System.out.println("The game is very simple you have to guess the number which is selected by me..");
         System.out.println("If you want to know the rules type 1 or you are familiar with them type 2");
         Scanner Obj=new Scanner(System.in);
         choice=Obj.nextInt();
         if(choice==1)
         {
        	 System.out.println("Rules:\r\n"
        	 		+ " \r\n"
        	 		+ "   you will only have 9 chances to guess the number\r\n"
        	 		+ "   numbers other than 0-100 are not encouraged\r\n"
        	 		+ "   you will loose a chance for one wrong guess");
        	 System.out.println("Hope you are clear with the rules let's start the game...s");
         }
         else if(choice==2)
         {
        	 System.out.println("Let's start the game!!");
         }
         else {
        	 System.out.println("Invalid input!!!");
         }
         Random obj=new Random();
         RandomNumber=obj.nextInt(100); //Generates a random number between 0-100
         System.out.println("Guess a number Between 0-100 ");
         number=Obj.nextInt();
         for(i=1;i<5;i++)
         {
        	 
        	 if(number==RandomNumber)
        	 {
        		 System.out.println("Incredible!! That's a correct guess");
        		 break;
        	 }
        	 else if(number>=RandomNumber)
        	 {
        		 System.out.println("That's greater than  my number, Try to choose another one");
        	 }
        	 else
        	 {
        		 System.out.println("That's less than my number, Try another one");
        	 }
        	 System.out.println("Guess Again: ");
        	 number=Obj.nextInt();
         }
         if(i==5)
         {
        	 System.out.println("Sorry! The number is: "+ RandomNumber);
         }
	}

}
