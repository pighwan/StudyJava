package j07_ObjectOrientedProgramming;

public class Ex02_MyOOP {	
	public static void main(String[] args) {
		delimiter = "----";
		printA();
		printA();		
		printB();
		printB();
		
		delimiter = "****";
		printA();
		printA();		
		printB();
		printB();		

	} // main
	
	public static String delimiter = "";
	
	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	} // printA
	
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	} // printB

} // class
