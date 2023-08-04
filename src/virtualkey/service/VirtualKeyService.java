package virtualkey.service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class VirtualKeyService {
	File destination = new File("./VirtualKeyFiles");
	
	//The constructor will create the directory for our files
	public VirtualKeyService(){
		if(destination.exists() == false) {
			destination.mkdir();
		}
	}
	//We use this function to create some test files
	public void createSomeFiles() {
		File file1 = new File(destination+"/file1.txt");
		File file2 = new File(destination+"/file2.txt");
		File file3 = new File(destination+"/maria.txt");
		File file4 = new File(destination+"/alex.txt");
		
		try {
			file1.createNewFile();
			file2.createNewFile();
			file3.createNewFile();
			file4.createNewFile();
		}
		catch (IOException e){
			System.out.println("Files could not be created");
		}
	}
	
	//This method will display the contents of the directory
	public void displayFiles() {
		
		String[] sortedFiles = destination.list(); //get the list of file names in the destination directory
		//String[] sortedFiles = {"maria", "alex", "dimitra","danil"}; //astring array to check the sorting
		
		if(sortedFiles.length!=0) {
			Arrays.sort(sortedFiles); //sort the names 
			for(String s:sortedFiles) { //iterate through the strings in the array string
			System.out.println(s);
			}
		}
		else {
			System.out.println("There are no files to display");
		}
		
	}

}
