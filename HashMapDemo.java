package Pack;

import java.util.*;
public class HashMapDemo {

   public static void main(String args[]) {
   
    
      HashMap<String, Double> hm = new HashMap<String, Double>();
      
     
      hm.put("Surya", new Double(3434.34));
      hm.put("Chethan", new Double(123.22));
      hm.put("Ayan", new Double(1378.00));
      hm.put("Daisy", new Double(99.22));
      hm.put("Corona", new Double(-19.08));
      
      
      Set<?> set = hm.entrySet();
     
      Iterator<?> i = set.iterator();
      
      
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      
      
      double balance = ((Double)hm.get("Surya")).doubleValue();
      hm.put("Surya", new Double(balance + 1000));
      System.out.println("Surya's new balance: " + hm.get("Surya"));
   }
}