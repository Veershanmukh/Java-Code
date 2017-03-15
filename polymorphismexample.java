package polyex;

public class polymorphismexample {

	void run(){System.out.println("run");}
	
	}
		
	 class poly extends polymorphismexample {  
			  
		void run(){System.out.println("running safely");}  
		
			  
		public static void main(String[] args) {
			polymorphismexample p = new poly();
			p.run();
			
		}

		}