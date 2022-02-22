package j07_ObjectOrientedProgramming;

public class Ex05_Instance {	
	public static void main(String[] args) {
		Ex04_Print2 p1 = new Ex04_Print2("----");
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Ex04_Print2 p2 = new Ex04_Print2("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		System.out.println("\n");
		p1.A();
		p2.A();
		p1.A();
		p2.A();
	} // main	

} // class
