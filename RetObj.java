package ConditionalStatements;


public class RetObj {

	
	

		
		
	     public RetObj() {
	    	  System.out.println("Hi i am constructor");
		      }

		      public RetObj getReturnObject() {
		        RetObj ret = new RetObj();
		        return ret;
		      }
		

	
		      public static void main(String args[]) {
		    	  
		    	  
		    	  RetObj r = new RetObj();
		    	  RetObj r2=r.getReturnObject();
		     

		        
		

	}

}