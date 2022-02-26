package j09_FlowControl;

public class Ex06_LogicalOperatorApp {

	public static void main(String[] args) {
		
		// AND
		System.out.println(1 == 1); // true
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		System.out.println("");
		
		// OR
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		System.out.println();
		
		// NOT
		System.out.println(!true); // false
		System.out.println(!false); // true

	} // main

} // class
