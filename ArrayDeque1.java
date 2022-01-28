package AdvancedLevelArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDeque1 {
	
	public static void main(String[] args) {
	
		
		Deque<String> editHistory = new ArrayDeque<>();
	 //System.out.println("Taking Action : null");	
		//editHistory.push(null);
		System.out.println("Taking Action : Making the next bold");	
		editHistory.push("Making the next bold");
		 System.out.println("Taking Action : adiing some text");	
			editHistory.push(" adiing some text");
			 System.out.println("Taking Action : adding new paragraph");	
				editHistory.push("adding new paragraph");
				
				System.out.println();
				System.out.println("the last action in the list " +editHistory.peek());
				
				System.out.println("undoing the last action: " +editHistory.pop());
				System.out.println("undoing the last action: " +editHistory.pop());
				
				System.out.println();
				 System.out.println("Taking Action : making the text italic");	
					editHistory.push(" making the text italic");
					
				System.out.println("edit hostory: " +editHistory);
				
	}

}
