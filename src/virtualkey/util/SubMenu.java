package virtualkey.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import virtualkey.exception.NumberOutOfRangeException;
import virtualkey.service.VirtualKeyService;

public class SubMenu {
	
	public static void subMenu(VirtualKeyService vks) {
		Scanner sc = new Scanner(System.in); //initialize the scanner object to take input from keyboard
		boolean exit = false;
		
		System.out.println("Here are the sub-menu choices:");
		System.out.println("1. Add a file 2. Delete a file 3. Search for a file 4. Exit the submenu");
		
		int input;
		String filename;
		
		do {
			System.out.println("Please enter your choice by writing a number in the range 1-4");
			try {
			input = sc.nextInt(); //take value from keyboard
				switch(input) {
					case 1: System.out.println("Please type the name of the file you want to add");
					filename = sc.next();
					System.out.println(vks.addFile(filename));
					break;
					case 2: System.out.println("We will call the delete method");
					break;
					case 3: System.out.println("Please type the name of the file you want to search for.");
					filename = sc.next();
					System.out.println(vks.searchFile(filename));
					break;
					case 4: System.out.println("We will exit");
					exit = true;
					break;
					default: 
					throw new NumberOutOfRangeException("The number you typed is not in the range 1-4. Try again");
					
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
		
		//sc.close(); //if you close the sc object, you close keyboard input stream, which is still needed 
		//by the MainMenu method
		
		return;
	}

}
