package j07_ObjectOrientedProgramming;

class Ex04_Print2 {
	// Print라는 클래스를 만들고 그 안에 delimiter, A, B라는 메소드를 넣음
	public String delimiter = "";
	
	public Ex04_Print2(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	} // A
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	} // B
	
} // class
