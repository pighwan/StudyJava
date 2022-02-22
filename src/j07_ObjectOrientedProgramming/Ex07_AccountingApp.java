package j07_ObjectOrientedProgramming;

class Accounting {
	public double valueOfSupply; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	
	public double getVAT() {	    // 부가 가치세
		return valueOfSupply*vatRate;
	}
	
	public double getTotal() {   // 합계
		return valueOfSupply + getVAT();
	}
} // Accounting

public class Ex07_AccountingApp {
	
	public static void main(String[] args) {	
		Accounting a1 = new Accounting(10000.0);		
		Accounting a2 = new Accounting(20000.0);		
		
		System.out.println("Value of supply : "+a1.valueOfSupply);
		System.out.println("Value of supply : "+a2.valueOfSupply);
		
		System.out.println("VAT : "+a1.getVAT());
		System.out.println("VAT : "+a2.getVAT());
		
		System.out.println("Total : "+a1.getTotal());
		System.out.println("Total : "+a2.getTotal());		
		 
	} // main

} // class
