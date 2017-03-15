package strings;

public class UsingStrings {

	public static void main(String[] args) {

		String value =  "Veer"; 

		 

	     value = value+" clinfox"; 

	     System.out.println("using String: "+value);

	     StringBuffer value1 = new StringBuffer("appended ");

	     value1.append("using append method"); 

	     System.out.println(" using string Buffer: "+value1);

	     

	     


	     StringBuilder value2 = new StringBuilder("appended ");

	     value2.append("using append method ");

	     System.out.println("using StringBuilder: "+value2);

	}




}
