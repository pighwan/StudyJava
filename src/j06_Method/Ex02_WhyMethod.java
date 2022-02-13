package j06_Method;

public class Ex02_WhyMethod {

	public static void main(String[] args) {
		
		// 100000000
		printTwoTimes("a", "-"); // "a", "-" : 얘네를 인자(argument)라 부름
		// 100000000
		printTwoTimes("a", "*");
		// 100000000
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
	} // main

	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	} // printTwoTimes

	
} // class
