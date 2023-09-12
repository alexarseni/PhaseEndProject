package virtualkey.util;

import java.util.InputMismatchException;
import java.util.Scanner;
import virtualkey.service.VirtualKeyService;

public class SubMenu {
	
	public static void subMenu(VirtualKeyService vks) {
		Scanner sc = new Scanner(System.in); //initialize the scanner object to take input from keyboard
		boolean exit = false; //this variable will be used to exit the while loop later on
		
		System.out.println("Here are the sub-menu choices:");
		System.out.println("1. Add a file 2. Delete a file 3. Search for a file 4. Exit the submenu\n");
		
		int input; //these two variables will be used to save the user's input.
		String filename;
		
		do {
			System.out.println("Please enter your choice by writing a number in the range 1-4");
			try {
			input = sc.nextInt(); //take value from keyboard
			sc.nextLine(); //discard anything else the user may have typed
				switch(input) {
					case 1: 
					System.out.println("Please type the name of the file you want to add");
					filename = sc.next(); //take the name of the file from user
					System.out.println(vks.addFile(filename)); //call the addFile business method and print the returned statement
					System.out.println();
					sc.nextLine(); //discard anything else the user may have typed
					break;
					case 2: System.out.println("Please type the name of the file you want to delete.");
					filename = sc.next(); //take the name of the file from user
					System.out.println(vks.deleteFile(filename)); //call the deleteFile method and print the returned statement
					System.out.println();
					sc.nextLine(); //discard anything else the user may have typed
					break;
					case 3: System.out.println("Please type the name of the file you want to search for.");
					filename = sc.next();//take the name of the file from user
					System.out.println(vks.searchFile(filename)); //call the searchFile method and print the returned statement
					System.out.println();
					sc.nextLine(); //discard anything else the user may have typed
					break;
					case 4: System.out.println("Back to main menu\n");
					exit = true; //change the variable's value to true to exit the do...while loop.
					break;
					default: 
					System.out.println("The number you typed is not in the range 1-4. Try again\n");
					
				}
			}
			catch(InputMismatchException e) {
				System.out.println("What you typed was not a number. Try again\n");
				sc.nextLine();
			}
			
			
		}while(exit==false);
		
		return;
	}

}
