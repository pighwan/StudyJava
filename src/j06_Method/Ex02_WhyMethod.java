package j06_Method;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02_WhyMethod {

	public static void main(String[] args) throws IOException {
		
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
//		Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));
		
	} // main
	
	public static String twoTimes(String text, String delimeter) {
		String out = "";
		out = out + delimeter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
	} // twoTimes

	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	} // printTwoTimes

	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();
	} // printTwoTimes
	
} // class
