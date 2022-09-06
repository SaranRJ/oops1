package org.oop;

public class Inheritance {

	public void empId() {
		System.out.println("12345");

	}
	
	public void empName() {
	System.out.println("Saran");	
 
	}
	
	public void emp(int empId, String name) {
		System.out.println(empId + " "+ name);
		//System.out.println(name);
	}
	
	private void emp(String name, int empId) {
		
	}

	
	
	public static void main(String[] args) {
	
		Inheritance emp = new Inheritance();
		emp.empId();
		emp.empName();
		emp.emp(12345, "Saran");
		
	}
	
}
