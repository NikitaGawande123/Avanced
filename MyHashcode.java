package AdvancedLevelHashCode;

public class MyHashcode {
	  public static void main(String[] args){ 
	
	 String a = "Andrew";  
     String b = "Andrew";  

     if(a.equals(b)){    
         System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());  
       
     }  

     String c = "Nikita";  
     String d= "Durga";  

     if(c.equals(d)){      
         System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());  
           
     }  
 }  

}
