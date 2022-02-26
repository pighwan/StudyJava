package j09_FlowControl;

public class Ex07_AuthApp2 {

	public static void main(String[] args) {
		System.out.println(args[0]);
		
		String id = "pig";
		String inputId = args[0];
		
		String password = "1111";
		String password2 = "2222";
		String inputPassword = args[1];
		
		
		System.out.println("Hi.");		

		boolean isRightPass = (inputPassword.equals(password) || inputPassword.equals(password2) );
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Hello GGulGGul2~~");			
		} else {
			System.out.println("Who are you??");
		}		
		
	} // main

} // class
