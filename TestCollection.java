package pack;

import java.util.*;  
class TestCollection{  
 public static void main(String args[]){  
  
  HashSet<String> set=new HashSet<String>();  
  set.add("surya");  
  set.add("chethan");  
  set.add("sharath");  
  set.add("uday");  
   
  Iterator<String> itr=set.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  