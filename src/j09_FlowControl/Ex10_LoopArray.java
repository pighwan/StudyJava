package j09_FlowControl;

public class Ex10_LoopArray {

	public static void main(String[] args) {
		/*
		 *  <li>pig</li> 	
		 *  <li>dog</li>
		 *  <li>cat</li>
		 */
		
		String[] users = new String[3];
		users[0] = "pig"; 
		users[1] = "dog"; 
		users[2] = "cat";
		
		for(int i = 0; i < 3; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}
		
		for(int j = 0; j < users.length; j++) {
			System.out.println(users[j]+",");
		}
		
		
	} // main

} // class
