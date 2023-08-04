package virtualkey.main;

import virtualkey.util.*;

public class VirtualKeyApp {

	public static void main(String[] args) {
		//Directory.makeDirectory(); //created the directory that will store our files
		
		WelcomeScreen.welcome(); //prints the Welcome Screen
		MainMenu.mainMenu();	 //calls the main menu method
		
		System.out.println("Bye Bye");	 

	}

}
