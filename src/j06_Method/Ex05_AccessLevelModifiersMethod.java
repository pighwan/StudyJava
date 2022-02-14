package j06_Method;

class Greeting{
	// public 위치에는 다른 것들도 올 수 있음
	// 기본적으로 public, 그리고 protected, default, private
	public static void hi() {
		System.out.println("Hi~");
	}
}

public class Ex05_AccessLevelModifiersMethod {
//	private static void hi() {
//		System.out.println("Hi~");
//	} // private는 같은 클레스 안에서만 사용 가능. private을 써주려면 여기에 써주어야함
	
	
	public static void main(String[] args) {
		Greeting.hi(); // Greeting class 안에 있는 hi를 사용
	} // main

} // class
