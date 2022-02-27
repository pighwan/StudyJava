package j09_FlowControl;

public class Ex08_LoopApp {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println("=== while ===");
		int i = 0;
		while(i < 3) {
			System.out.println(2);
			System.out.println(3);
//			i = i + 1;
			i++;
		}
		
		System.out.println("=== for ===");
		for(int j = 0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
		
		System.out.println(4);
		
		

	} // main

} // class
