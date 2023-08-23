package virtualkey.main;

import virtualkey.util.*;

public class VirtualKeyApp {
	
	public static void welcome() {
		System.out.println("Welcome to my application");
		System.out.println("Application name: VirtualKeyApp");
		System.out.println("Developer: Arseni Alexandra");
		System.out.println("Email: alexandra.arseni@vodafone.com\n");
	}

	public static void main(String[] args) {
		//Directory.makeDirectory(); //created the directory that will store our files
		
		welcome(); //prints the Welcome Screen
		MainMenu.mainMenu();	 //calls the main menu method
		
		System.out.println("Bye Bye");	 

	}

}
