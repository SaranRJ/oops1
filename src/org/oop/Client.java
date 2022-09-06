package org.oop;

public class Client extends Company {

	private void project() {
		System.out.println("AI");
	}
	
	
	public static void main(String[] args) {
		

		Client cl = new Client();
		cl.project();
		cl.companyName();		
		
	}

}
