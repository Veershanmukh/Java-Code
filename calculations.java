
public class calculations {

	 void sum(int a,int b)
		{
			System.out.println(a+b);
		}
		 void sum(int a,int b,int c, int d)
		{
			System.out.println(a+b+c+d);
		}
		public static void main(String args[])
		{
			calculations obj =new calculations();
			obj.sum(10, 10, 10, 20);
			obj.sum(20, 20);
		}
	}
