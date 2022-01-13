package AdvancedLevelFileHandling;

import java.io.File;

public class MtFileDlt {
	
	 public static void main(String[] args) { 
		    File myObj = new File("Nikita.g.txt"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
		  } 

}
