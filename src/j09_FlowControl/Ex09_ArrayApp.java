package j09_FlowControl;

public class Ex09_ArrayApp {

	public static void main(String[] args) {
		
		// pig, dog, cat
//		String users = "pig, dog, cat";
		String[] users = new String[3];
		users[0] = "pig"; // 갯수를 셀 때는 1, 2, 3 하지만 몇 번째 자리인지 일때는 0부터 시작
		users[1] = "dog"; // 여기서 1을 index, dog를 element라 부름
		users[2] = "cat";
		
		System.out.println(users[1]);
		System.out.println(users.length); // length : 이 배열에 몇 개의 값이 담겨있는지 알 수 있음(이 배열이 몇 칸짜리 인지)
		
//		int[] scores = new int[3];
		int[] scores = {10, 100, 90};
		System.out.println(scores[2]);
		System.out.println(scores.length);
		
		
		
	} // main

} // class
