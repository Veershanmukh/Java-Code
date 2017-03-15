package Sample;

public class  inherit extends inherit1
{
public inherit(double d1,double d2)
{
	super(d1,d2);
}
public double area()
{
	return dim1*dim2;
}

public static void main(String args[])
{
	inherit r=new inherit (10,20);
System.out.println("area of recatngle"+r.area());
}

}
