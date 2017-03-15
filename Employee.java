package ExamplePack;

public class Employee {


	// class variables
	int eno;
	String ename;
	double salary;
	
	// class functions
	public Employee()  // Default constructor
	{
		eno=100;
		ename="Raju";
		salary=25000;
	}
	
	
	// Arguments Constructor
	public Employee(int prm_eno,String prm_ename,double prm_salary)
	{
		eno=prm_eno;
		ename=prm_ename;
		salary=prm_salary;
		
	}
	
	// Copy Constructor
	public Employee(Employee e) 
	{
		eno=e.eno;
		ename=e.ename;
		salary=e.salary;
	}
	
	
	public void Display()
	{
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+salary);
	}

	public static void main(String[] args)
	{
		Employee e1=new Employee(); // Default constructor object
		
		Employee e2=new Employee(200,"kumar",35000); // Argument Constructor object 
		
		Employee e3=new Employee(e1); // Copy Constructor object 
		
		System.out.println("Defulat constructor employee values...");
		e1.Display();
		
		System.out.println("Arguments constructor employee values...");
		e2.Display();
		
		
		System.out.println("Copy constructor employee values...");
		e3.Display();

	}

}










