package virtualkey.util;

import java.util.InputMismatchException;
import java.util.Scanner;
import virtualkey.service.VirtualKeyService;

public class MainMenu {
	
	public static void mainMenu() {
		
		Scanner sc = new Scanner(System.in); //initialize the scanner object to take input from keyboard
		boolean exit = false; //this variable will be used to exit the do..while loop later on
		VirtualKeyService vks = new VirtualKeyService(); //create a VirtualKeyService object to gain access to the business methods.
		
		//this method is optional. it creates two test files for easier testing.
		vks.createSomeFiles();
		
		//prompt the user with his choices.
		System.out.println("Here are your choices:");
		System.out.println("1. Display all file names 2. Access Business Methods 3. Exit the application\n");
		
		int input; //this variable will store the user's input
		
		do {
			System.out.println("Please enter your choice by writing a number in the range 1-3");
			try {
			input = sc.nextInt(); //take value from keyboard
				switch(input) {
					case 1:
					String sortedFiles[] = vks.getFiles();
					//we need to to iterate through the array of strings to get each file name, only if the array is not empty.
					if(sortedFiles.length!=0) {
						for(String s:sortedFiles) { 	
							System.out.println(s);
						}
						System.out.println();
					}
					else {
						System.out.println("There are no files to display\n");
					}
					break;
					
					case 2:
					//we call the submenu method and pass the VirtualKeyService object as an argument
					SubMenu.subMenu(vks);
					break;
					
					case 3: System.out.println("We will exit the application");
					exit = true; //change the variable's value to true, to exit the while loop.
					break;
					default:
					System.out.println("The number you typed is out of range");
					
				}
			}
			catch(InputMismatchException e) {
				System.out.println("What you typed was not a number. Try again\n");
			}
			
			sc.nextLine(); //read and discard anything else the user may have inputed.
			
		}while(exit==false);
		
		sc.close(); //close the scanner object
		
	}

}
