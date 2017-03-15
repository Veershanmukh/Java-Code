package Samplepack;

public class EmployeeClass {
	int eno;
	double salary;
	String ename;
	
	void InputDetails(int prm_eno,String prm_ename,double prm_salary )
	{
	eno=prm_eno;
	ename=prm_ename;;
	salary=prm_salary;
	}
	
	
	
	
	
void display()
{
	System.out.println("Empolyee Details");
	System.out.println("---------------------");
	System.out.println("Employee Number :"+eno);
	System.out.println("Employee Name :"+ename);
	System.out.println("Employee Salary :"+salary);
}
	public static void main(String[] args) {
		EmployeeClass a=new EmployeeClass();
		
		a.InputDetails(25,"Mahesh", 25000);
		
		a.display();
		
		a.InputDetails(50,"Babu", 50000);
		a.display();
	}


}