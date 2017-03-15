package encapsulation;

public class RunEncap {

	public static void main(String args[]) {
	      EncapTest encap = new EncapTest();
	      encap.setName("veer");
	      encap.setAge(25);
	      encap.setIdNum("4669");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	      System.out.print(" IdNum :" + encap.getIdNum());
	      
	   }
	  
	}
