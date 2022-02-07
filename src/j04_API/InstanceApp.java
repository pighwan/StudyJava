package j04_API;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		PrintWriter p1 = new PrintWriter("result1.txt");	// 여기서 p1이 인스턴스임
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 2");
		
		// PrintWriter는 Math와 달리 Constructor가 존재
		
//		PrintWriter.write("result1.text", "Hello 1");
//		PrintWriter.write("result2.text", "Hello 2");
//		PrintWriter.write("result1.text", "Hello 1");
//		PrintWriter.write("result2.text", "Hello 2");
//		PrintWriter.write("result1.text", "Hello 1");
//		PrintWriter.write("result2.text", "Hello 2");
//		PrintWriter.write("result1.text", "Hello 1");
//		PrintWriter.write("result2.text", "Hello 2");
//		PrintWriter.write("result1.text", "Hello 1");
//		PrintWriter.write("result2.text", "Hello 2");
//		PrintWriter.write("result1.text", "Hello 1");
//		PrintWriter.write("result2.text", "Hello 2");
//		PrintWriter.write("result1.text", "Hello 1");
//		PrintWriter.write("result2.text", "Hello 2");
	}  //  main

} // class
