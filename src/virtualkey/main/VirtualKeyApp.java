package virtualkey.main;

import virtualkey.util.*;

public class VirtualKeyApp {
	
	public static void welcome() {
		System.out.println("Welcome to my application");
		System.out.println("Application name: VirtualKeyApp");
		System.out.println("Developer: Arseni Alexandra");
		System.out.println("Email: alexandra.arseni@vodafone.com");
		System.out.println("Github URL: https://github.com/alexarseni/PhaseEndProject");
		System.out.println("---------------------------------------------------------\n");
	}

	public static void main(String[] args) {
		
		welcome(); //prints the Welcome Screen
		MainMenu.mainMenu();	 //calls the main menu method
		
		System.out.println("Bye Bye");	 

	}

}
