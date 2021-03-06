package j11_Exception;

public class Ex01_ExceptionApp {

	public static void main(String[] args) {
		
		System.out.println(1);		
		try {
			System.out.println(2/0); // ArithmeticException(산술적인 예외) 발생
		} catch (ArithmeticException e) {
			System.out.println("잘못된 계산이넹~");
		} // try ~ catch 구문을 이용하지 않으면 Exception이 발생했을 때 거기서 멈춤
		System.out.println(3);
		
		int[] scores = {10, 20, 30};
		System.out.println(scores[0]);
		try {
			System.out.println(scores[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 값이여요!!");
		}
		System.out.println(scores[2]);
		
		System.out.println("실험");
		System.out.println(1);
		try {
			System.out.println(2);
			//System.out.println(scores[3]); // ArrayIndexOutOfBoundsException이 실행되고 그 밑에 명령은 실행될 기회를 받지 못함
			System.out.println(3);
			System.out.println(2 / 0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println("계산이 잘못된거 같아용!"+e.getMessage()); // e.getMessage(): 에러의 원인이 무엇인지 알려줌
			e.printStackTrace(); // 어떤 에러가 뜨는지 표시해줌
		} catch (Exception e) {
			System.out.println("뭔가 이상합니다. 오류가 발생했습니다."+e.getMessage()); 
			e.printStackTrace(); 
		}
//		} catch (ArithmeticException e) {
//			System.out.println("잘못된 계산이넹~");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("없는 값이여요!!");
//		}
		System.out.println(5);
		
	} // main

} // class
