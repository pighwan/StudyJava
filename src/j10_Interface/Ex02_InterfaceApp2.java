package j10_Interface;

interface Calculable2 {
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable{
	void print(); // 메소드를 인터페이스에 정의할 때는 내용이 들어가지 않음(변수를 정의할 때는 내용이 들어감)
}

class RealCal2 implements Calculable2, Printable{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	public void print() {
		System.out.println("This is RealCal!!");		
	}
}

public class Ex02_InterfaceApp2 {

	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스를 만들어주세요~
		RealCal2 c = new RealCal2();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
	} // main

} // class
