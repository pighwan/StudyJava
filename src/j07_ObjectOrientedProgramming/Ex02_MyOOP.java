package j07_ObjectOrientedProgramming;

public class Ex02_MyOOP {	
	public static void main(String[] args) {
		Ex03_Print1.delimiter = "----";
		Ex03_Print1.A();		
		Ex03_Print1.A();
		Ex03_Print1.B();
		Ex03_Print1.B();
		
		Ex03_Print1.delimiter = "****";
		Ex03_Print1.A();
		Ex03_Print1.A();		
		Ex03_Print1.B();
		Ex03_Print1.B();	
		
		System.out.println("\n");
		Ex03_Print1.delimiter = "----";
		Ex03_Print1.A();	
		Ex03_Print1.delimiter = "****";
		Ex03_Print1.A();
		Ex03_Print1.delimiter = "----";
		Ex03_Print1.A();	
		Ex03_Print1.delimiter = "****";
		Ex03_Print1.A();
		
		
		
	} // main	

} // class
