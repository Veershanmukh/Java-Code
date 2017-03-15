package pack;

import java.util.*;  
public class TreeMapExamples {  
   public static void main(String args[]) {  
   
   Map<Integer, String> map = new TreeMap<Integer, String>();           
   map.put(102,"Let us C");  
   map.put(103, "Operating System");  
   map.put(101, "Data Communication and Networking");  
   System.out.println("Values before remove: "+ map);    
 
   map.remove(102);  
   System.out.println("Values after remove: "+ map);  
   }      
}  