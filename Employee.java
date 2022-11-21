package myfirst;

public class Employee {
	
	int empid;
	String name;
	int salary;
	
	void showDetails()
	{
		System.out.println("Employee ID: " +empid);
		System.out.println("Employee Name: " +name);
		System.out.println("Employee Salary: " +salary);
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("Employee Details");
		System.out.println("*******************");
		System.out.println();
		
		Employee e1 = new Employee();
		e1.empid = 1;
		e1.name = "A";
		e1.salary = 10000;
		e1.showDetails();
		
		Employee e2 = new Employee();
		e2.empid = 2;
		e2.name = "B";
		e2.salary = 20000;
		e2.showDetails();

	}

}
