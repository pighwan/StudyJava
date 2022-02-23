package j08_Inheritance;

class Cal {
	public int sum(int v1, int v2) {
		return v1+v2;
	} // sum
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3;
	} // sum   -> Overloading(상속과는 굳이 상관 엄슴!)
	
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
	public int minus(int v1, int v2) {
		return v1-v2;
	} // 부모가 갖고 있지 않은 메소드를 추가
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1, v2);
	} // 부모가 가지고 있는 메소드를 재정의(Overriding)
} // Cal3

public class Ex01_InheritanceApp { // Inheritance : 상속 !

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println("인스턴스 c의 합계(v1,v2) => "+c.sum(2, 1));
		System.out.println("인스턴스 c의 합계(v1,v2,v3) => "+c.sum(2, 1, 1));
		
		Cal3 c3 = new Cal3();
		System.out.println("인스턴스 c3의 합계 => "+c3.sum(2, 1));		
		System.out.println("인스턴스 c3의 차 => "+c3.minus(2, 1));
		System.out.println("인스턴스 c3의 합계 => "+c3.sum(2, 1));	
	} // main

} // class


