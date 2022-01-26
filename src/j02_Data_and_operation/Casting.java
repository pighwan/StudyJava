package j02_Data_and_operation;

public class Casting {

	public static void main(String[] args) {

		double a = 1.1;
		double b = 1;
		double b2 = (double)1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(b2);
		
		// int c = 1.1; // cannot convert from double to int
		double d = 1.1;
		int e = (int) 1.1; // 형변환
		System.out.println(d);
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println("** f의 값은 => "+f);
		System.out.println(f.getClass()); // f가 어떤 class 인지 알려줌
		
	} // main

} // class
