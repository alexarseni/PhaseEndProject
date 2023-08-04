package virtualkey.util;

import java.util.InputMismatchException;
import java.util.Scanner;
import virtualkey.exception.*;
import virtualkey.service.VirtualKeyService;

public class MainMenu {
	
	public static void mainMenu() {
		
		Scanner sc = new Scanner(System.in); //initialize the scanner object to take input from keyboard
		boolean exit = false;
		VirtualKeyService vks = new VirtualKeyService();
		
		vks.createSomeFiles();
		
		System.out.println("Here are your choices:");
		System.out.println("1. Display all file names 2. Access Business Methods 3. Exit the application");
		
		int input;
		
		
		do {
			System.out.println("Please enter your choice by writing a number in the range 1-3");
			try {
			input = sc.nextInt(); //take value from keyboard
				switch(input) {
					case 1: System.out.println("We will call the display method");
					vks.displayFiles();
					break;
					case 2: System.out.println("We will call the submenu method");
					SubMenu.subMenu();
					break;
					case 3: System.out.println("We will exit");
					exit = true;
					break;
					default: 
					throw new NumberOutOfRangeException("The number you typed is not in the range 1-3. Try again");
					
				}
			}
			catch(InputMismatchException e) {
				System.out.println("What you typed was not a number. Try again");
			}
			
			catch(NumberOutOfRangeException n){
				System.out.println(n.getMessage());
			}
			sc.nextLine(); //read and discard anything else the user may have inputed.
			
		}while(exit==false);
		
		sc.close(); //close the scanner object
		
	}

}
