package j02_Data_and_operation;

public class CharString {

	public static void main(String[] args) {
		System.out.println("생활코딩");
		// System.out.println('생활코딩'); 
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		// Invalid character constant
		// 생활코딩은 문자열이므로 ""를 사용해야함!
		
		System.out.println("생"); // 문자열. 이 상황에서 생은 문자열이기도, 문자이기도함 한글자이기 때문에.
		System.out.println('생'); // 문자
		
		System.out.println("생활코딩"+"입니다"); // 문자열과 문자열 간의 결합
		
		System.out.println(1+1); // 1+1
		System.out.println("1"+"1"); // 문자열과 문자열 간의 결합이기 때문에 11
		System.out.println('1'+'1'); // 아스키코드 49 + 49 = 98
		
		System.out.println("egoing said\n \"Welcome programming world!\""); // \(역슬러시)뒤에 "를 쓰면 문자로 인식
		// \n : 줄바꿈
	} // main

} // class
