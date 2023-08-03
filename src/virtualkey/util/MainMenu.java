package virtualkey.util;

import java.util.InputMismatchException;
import java.util.Scanner;
import virtualkey.exception.*;

public class MainMenu {
	
	public static void mainmenu() {
		
		Scanner sc = new Scanner(System.in); //initialize the scanner object to take input from keyboard
		boolean exit = false;
		
		System.out.println("Here are your choices:");
		System.out.println("1. Display all file names 2. Access Business Methods 3. Exit the application");
		
		int input;
		
		
		do {
			System.out.println("Please enter your choice by writing a number in the range 1-3");
			try {
			input = sc.nextInt(); //take value from keyboard
				switch(input) {
					case 1: System.out.println("We will call the display method");
					sc.nextLine(); //read till the next line in case the user typed trash
					break;
					case 2: System.out.println("We will call the submenu method");
					sc.nextLine();
					break;
					case 3: System.out.println("We will exit");
					sc.nextLine();
					exit = true;
					break;
					default: 
					throw new NumberOutOfRangeException("The number you typed is not in the range 1-3. Try again");
					
				}
			}
			catch(InputMismatchException e) {
				System.out.println("What you typed was not a number. Try again");
				sc.nextLine();
			}
			
			catch(NumberOutOfRangeException n){
				System.out.println(n.getMessage());
				sc.nextLine();
			}
			
		}while(exit==false);
		
		
	}

}
