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
	//We use this function to create some test files. Optional
	public void createSomeFiles() {
		File file1 = new File(destination+"/maria.txt");
		File file2 = new File(destination+"/alex.txt");
		
		try {
			file1.createNewFile();
			file2.createNewFile();
		}
		catch (IOException e){
			System.out.println("Files could not be created - IO Exception");
		}
	}
	
	//This method will display the contents of the destination directory
	public String[] getFiles() {
		
		String[] sortedFiles = destination.list(); //get the list of file names in the destination directory
		
		if(sortedFiles.length!=0) { //if the returned array is not empty, proceed to sort it.
			Arrays.sort(sortedFiles); //sort the names 
		}
		return sortedFiles;
	}
	//The add method takes the user-specified name as an argument
	public String addFile(String filename){
		//create newFile object with the correct path.
		File newFile = new File(destination+"/"+filename);

		try{ //if the .createNewFile() command creates the file successfully it returns true.
			if(newFile.createNewFile()) {
				return "File "+filename+" created successfully";
			}
			else {
				return "The file already exists";
			}
		}
		catch (IOException e){
			return "Files could not be created - IO Exception";
		}	
	}
	//The searchFile takes the user-specified name as an argument.
	public String searchFile(String filename) {
		//create the correct object/path for the file
		File newFile = new File(destination+"/"+filename);
		//the .exists() method return true, if the file already exists.
		if(newFile.exists()) {
			return "Found the file you are searching for";
		}
		else {
			return "The file you are searching for does not exist";
		}
	}
	//The deleteFile takes the user-specified name of the file as an argument.
	public String deleteFile(String filename) {
		File newfile = new File(destination+"/"+filename);
		if (newfile.exists()) { //we first check whther the file exists
			newfile.delete(); //if it does then we proceed to delete it
			return "File deleted sucessfully";
		}
		else { //if it does not exists, we notify the user.
			return "The file you want to delete does not exist";
		}
	}
}
