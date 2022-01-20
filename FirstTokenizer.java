package AdvancedLevelStringTokenizer;

import java.util.StringTokenizer;

public class FirstTokenizer {

	public static void main(String[] args) {
		
		
		   StringTokenizer st = new StringTokenizer("my name is Nikita Gawande"," ");  
		
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		         

		  
		    	
		     }
		    	
	}
}
