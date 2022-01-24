package AdvancedLevelHashTable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable1 {

	public static void main(String[] args) {
		 Hashtable<Integer,String> n=new Hashtable<Integer,String>();  
		  
		  n.put(100,"Amar");  
		  n.put(102,"Kartik");  
		  n.put(101,"Durga");  
		  n.put(103,"Nikita");  
		  
		  for(Entry<Integer, String> name:n.entrySet()){  
		   System.out.println(" "+name.getValue());  
		  }  
	}

}
