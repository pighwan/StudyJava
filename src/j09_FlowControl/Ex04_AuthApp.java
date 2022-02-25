package j09_FlowControl;

public class Ex04_AuthApp {

	public static void main(String[] args) {
		System.out.println(args[0]);
		
		String id = "pig";
		String inputId = args[0];
		
		String password = "1111";
		String inputPassword = args[1];
		
		System.out.println("Hi.");
		
		//if(inputId == id) { // x
//		if(inputId.equals(id)) {
//			if(inputPassword.equals(inputPassword)) {
//				System.out.println("Hello GGulGGul2~~");
//			} else {
//				System.out.println("비밀번호가 틀렸습니당");
//			} 			
//		} else {
//			System.out.println("Who are you??");
//		}
		
		if(inputId.equals(id) && inputPassword.equals(inputPassword)) { // 논리연산자를 이용해 단순화
			System.out.println("Hello GGulGGul2~~");			
		} else {
			System.out.println("Who are you??");
		}		
		
	} // main

} // class
