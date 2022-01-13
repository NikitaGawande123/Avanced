package AdvancedLevelFileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWrite {

	public static void main(String[] args) {
		
		 try {
		      FileWriter myWriter = new FileWriter("Nickk.txt");
		      myWriter.write("My Name is Nikita Gawande!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
