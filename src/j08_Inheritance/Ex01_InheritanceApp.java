package j08_Inheritance;

class Cal {
	public int sum(int v1, int v2) {
		return v1+v2;
	} // sum
} // Cal

//class Cal2 { // Cal 클래스를 복사한 후 minus 기능을 추가 한 것. 
//	public int sum(int v1, int v2) {
//		return v1+v2;
//	}
//	public int minus(int v1, int v2) {
//		return v1-v2;
//	}
//}

class Cal3 extends Cal { // Cal 클래스를 상속받은 것
	
} // Cal3

public class Ex01_InheritanceApp { // Inheritance : 상속 !

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println("인스턴스 c의 합계 => "+c.sum(2, 1));
		
		Cal3 c3 = new Cal3();
		System.out.println("인스턴스 c3의 합계 => "+c3.sum(2, 1));		
	
	} // main

} // class


