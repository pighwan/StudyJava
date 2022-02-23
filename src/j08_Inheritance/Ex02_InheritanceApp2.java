package j08_Inheritance;

class Cal_ {
	int v1, v2;
	Cal_(int v1, int v2) {
		System.out.println("Cal_ init!!");
		this.v1 = v1;
		this.v2 = v2;
	} // 생성자
	
	public int sum() {
		return this.v1+v2;
	}
} // Cal_

class Cal_3 extends Cal_ {

	Cal_3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal_3 init!!");	
	} // Cal_ 클래스를 상속받은 것
	
	public int minus() {
		return this.v1-v2;
	}

} // Cal_3

public class Ex02_InheritanceApp2 { // Inheritance : 상속 !

	public static void main(String[] args) {
		Cal_ c = new Cal_(2, 1);			
		Cal_3 c3 = new Cal_3(2, 1);
		System.out.println(c3.sum());
		System.out.println(c3.minus());
		
	} // main

} // class


