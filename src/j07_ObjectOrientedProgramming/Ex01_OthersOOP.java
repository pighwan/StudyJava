package j07_ObjectOrientedProgramming;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01_OthersOOP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		System.out.println(Math.PI); // 3.14...
		System.out.println(Math.floor(1.7)); // 내림
		System.out.println(Math.ceil(1.3)); // 올림
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" java");
				
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" java2");
		f2.close();
		
		f1.write("!!!");
		f1.write("\nI like pig");
		f1.close();
		
	} // main

} // class
