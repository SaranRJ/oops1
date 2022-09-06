package org.oop;

public class Company extends Inheritance {

	public void companyName() {
		System.out.println("TCS");
		
	}
	
	@Override
	public void empName() {
		System.out.println("Vicky");
	}
	

	
	public static void main(String[] args) {
		
		Company c = new Company();
		c.companyName();
	    c.empId();
	    c.empName();
		
		
		
//		Inheritance i = new Inheritance();
//		i.empId();
//		i.empName();
		
	}
	
}
