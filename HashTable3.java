package AdvancedLevelHashTable;

import java.util.Hashtable;

public class HashTable3 {

	public static void main(String[] args) {
		
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
		     map.put(100,"Amit");    
		     map.put(102,"Ravi");   
		     map.put(101,"Vijay");    
		     map.put(103,"Rahul");    
		     
		     System.out.println(map.getOrDefault(101, "Not Found"));  
		     System.out.println(map.getOrDefault(105, "Not Found"));  
		     System.out.println(map.getOrDefault(102, "Not Found"));
             System.out.println(map.getOrDefault(108, "Not Found"));
	}
}
