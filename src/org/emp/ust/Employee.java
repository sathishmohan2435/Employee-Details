package org.emp.ust;

public class Employee {

	public void empId() {
		System.out.println();
		
	}
	public void empId(int a)
	{
		System.out.println(a);
	}
	public void empId(float b) {
		System.out.println( b);
	}
	public static void main(String arg[]) {
		Employee emp = new Employee();
		emp.empId();
		emp.empId(20);
		emp.empId(20);
		
	}
}
