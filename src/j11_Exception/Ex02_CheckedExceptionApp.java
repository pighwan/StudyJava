package j11_Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02_CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("Hello Pig~?");
			// close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 한다.
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 만약 f가 null이 아니라면 close 해라~
			if(f != null) {
				try {
					f.close();
				} catch(IOException e) {
					e.printStackTrace();
				}				
			}
		}
	} // main

} // class
