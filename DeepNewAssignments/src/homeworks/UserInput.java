package homeworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		int userInput;

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Please enter a number");
			userInput = scan.nextInt();
			System.out.println("The number entered by you is : " + userInput);
		} catch (InputMismatchException e) {
			System.out.println("Try again ,the number you entered is not an integer.Please try again.");
		}
		
		//Comment By Deepinder

	}

}


/* Assignment 2
   openBrowser() & closeBrowser() methods can be placed in a separate class & 
   make the remaining classes as child class */
 