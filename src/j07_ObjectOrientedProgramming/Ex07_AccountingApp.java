package j07_ObjectOrientedProgramming;

class Accounting {
	public static double valueOfSupply; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
} // Accounting

public class Ex07_AccountingApp {
	
	public static void main(String[] args) {				
		Accounting.valueOfSupply = 10000.0;
		double expenseRate = 0.3;	
		double expense = Accounting.valueOfSupply*expenseRate;
		double income = Accounting.valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		  
		System.out.println("Value of supply : "+Accounting.valueOfSupply); // 공급가			
		System.out.println("VAT : "+Accounting.getVAT()); // 부가가치세		
		System.out.println("Total : "+Accounting.getTotal()); // 합계		
		System.out.println("Expense : "+expense); 		
		System.out.println("Income : "+income); // 전체 수익		
		System.out.println("Dividend 1 : "+dividend1);		
		System.out.println("Dividend 2 : "+dividend2);		
		System.out.println("Dividend 3 : "+dividend3);
		
		 
	} // main

} // class
