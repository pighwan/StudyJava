package j11_Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Ex05_ThrowException {

	public static void main(String[] args) throws IOException {
//		try {
//			FileWriter f = new FileWriter("./data.txt");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 주석처리 한 것처럼 하거나 아예 위쪽에 throws IOException를 명시해줌
		FileWriter f = new FileWriter("./data.txt");
		
		// 내일부터는 웹

	} // main

} // class
