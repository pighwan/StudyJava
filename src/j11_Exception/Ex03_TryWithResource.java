package j11_Exception;

import java.io.FileWriter;
import java.io.IOException;

public class Ex03_TryWithResource {

	public static void main(String[] args) {
		// try with resource statements
		try(FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello Pig~?");
			//f.close();  이걸 내부적으로 해줌
		} catch(IOException e) {
			e.printStackTrace();
		}		
		
	} // main

} // class
