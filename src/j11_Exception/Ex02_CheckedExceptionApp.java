package j11_Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02_CheckedExceptionApp {

	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("data.txt");
			f.write("Hello Pig~?");
			f.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	} // main

} // class
