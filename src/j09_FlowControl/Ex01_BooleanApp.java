package j09_FlowControl;

public class Ex01_BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("One");
		System.out.println(1);
		
		// boolean
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello World!!";
//		String true = "Hello World~~"; // 변수로 사용 불가!(reserved word)
		
		// boolean 사용 예
		System.out.println(foo.contains("World")); // contains : 포함되다
		System.out.println(foo.contains("Pig")); // Pig는 없기에 false가 뜸
		
	} // main

} // class
