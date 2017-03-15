package samplePack;



	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Examples1 
	{

		public static void main(String[] args) throws NumberFormatException, IOException 
		{
			// Declare the array				
			int[][] a;
			
			// input statements in or java
			InputStreamReader istream = new InputStreamReader(System.in) ;
			BufferedReader bufRead = new BufferedReader(istream);
					
			
			// Declare the array size 
			System.out.println("Enter array Row size : ");
			int rsize=Integer.parseInt(bufRead.readLine());
			
			System.out.println("Enter Array Column size : ");
			int csize=Integer.parseInt(bufRead.readLine());
			
			
			// assign the size to array
			a=new int[rsize][csize];
			
			
	         // store the values in array using input stream  / buffer reader
	        System.out.println("Please Enter array values");
	        for(int i=0;i<rsize;i++)
	        {
	        	for(int j=0;j<csize;j++)
	        	{
	        		System.out.println("Please Enter a["+i+"]["+j+"] = ");
	            	a[i][j]=Integer.parseInt(bufRead.readLine());
	        	}
	        
	        }
			
					
			// Display the array values
		    System.out.println("Array values are....");
			for(int i=0;i<rsize;i++)
			{
				for(int j=0;j<csize;j++)
	        	{
					System.out.println(a[i][j]);
	        	}
			}

		}

	}

