package j07_ObjectOrientedProgramming;

class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // OK
		//System.out.println(instanceVar); // Error		
	} // classMethod
	
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // instanceMethod 안에서는 모두 사용 가능
	} // instanceMethod
	
	
	
}

public class Ex06_StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // OK
		//System.out.println(Foo.instanceVar); 
		//Error : instance는 instance를 통해서 사용하도록 고안된 변수임 
		
		Foo.classMethod();
		//Foo.instanceMethod(); // Error 
		// 인스턴스메소드는 인스턴스 소속이므로 클래스를 통해서 접근하는 것은 금지되어 있음
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "change by f1";
		System.out.println(Foo.classVar); // change by f1
		System.out.println(f2.classVar); // change by f1
		
		f1.instanceVar = "change by f1";
		System.out.println(f1.instanceVar); // change by f1
		System.out.println(f2.instanceVar); // I instance var
		
	} // main

} // class
