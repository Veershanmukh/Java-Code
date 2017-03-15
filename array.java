package Samplepack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Veer Shanmukh
 *
 */
/**
 * @author Veer Shanmukh
 *
 */
/**
 * @author Veer Shanmukh
 *
 */
public class array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] a=new int[5];
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b= new BufferedReader(i);
		
		for(int j = 0; j<=a.length;j++)
		{
			
		System.out.println("a["+j+"]=");
		a[j]=Integer.parseInt(b.readLine());
		
		
	}
		System.out.println("Given Array Values--");
		for(int j = 0; j<=a.length;j++)
			System.out.println(a[j]);
			
	

	}
}
