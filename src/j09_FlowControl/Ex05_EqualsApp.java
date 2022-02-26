package j09_FlowControl;

public class Ex05_EqualsApp {

	public static void main(String[] args) {
		// 원시데이터 타입일 때(boolean, int, double, short, long, float, char)
		int p1 = 1;
		int p2 = 1;
		System.out.println(p1 == p2); // true	
		
		// 원시데이터 타입이 아닐 때(String, Array, Date, File, ...)
		String o1 = "java";
		String o2 = new String("java");
		System.out.println(o1 == o2); // false  -> 같은 곳에 있는가
		System.out.println(o1.equals(o2)); // true  -> 내용이 같은가
		
		// 하지만 String은 원시데이터인 것처럼 작동됨(많이 쓰이는 것이기에 특혜를 받음)
		String o3 = "java2";
		String o4 = "java2";
		System.out.println(o3 == o4); // true
		System.out.println(o3.equals(o4)); // true
		
		
	} // main

} // class
