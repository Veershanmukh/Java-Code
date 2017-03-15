package overridingOverloading;

import overridingOverloading.student;

public class UsingStd extends student{ 
	
void studentDetails(String Name)

{

	System.out.println("Name of the student is: "+Name);

}



void studentDetails(String Name, int RollNo) 
{

	System.out.println("Name of the student: "+ Name +"Roll number"+RollNo);

}

static void Grade(int math) 

{

	System.out.println("Math Marks: "+ math);

	

}

static void Grade(char finalGrade){
	

}

public void studentAddress() 

{

	System.out.println("In child class");

}

public static void main(String[] args) { 

	String studentName = "Veer";

	int rollNumber = 145, grade= 60;

	

	UsingStd obj = new UsingStd();

	obj.studentDetails(studentName);

	obj.studentDetails(studentName,rollNumber);

	Grade(grade);

	obj.studentAddress(); 

}



}