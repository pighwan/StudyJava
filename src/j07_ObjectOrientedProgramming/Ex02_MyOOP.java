package j07_ObjectOrientedProgramming;

class Print{
	// Print라는 클래스를 만들고 그 안에 delimiter, A, B라는 메소드를 넣음
	public static String delimiter = "";
	
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	} // A
	
	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	} // B
} // Print

public class Ex02_MyOOP {	
	public static void main(String[] args) {
		Print.delimiter = "----";
		Print.A();		
		Print.A();
		Print.B();
		Print.B();
		
		Print.delimiter = "****";
		Print.A();
		Print.A();		
		Print.B();
		Print.B();		

	} // main
	
	

} // class
