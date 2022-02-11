package j05_MyApp;

// method : 서로 연관된 코드를 모아서 정리정돈하는 상자!

class Accounting{

	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply); // 공급가			
		System.out.println("VAT : "+getVAT()); // 부가가치세		
		System.out.println("Total : "+getTotal());			
		System.out.println("Expense : "+getExpense()); 		
		System.out.println("Income : "+getIncome()); // 전체 수익		
		System.out.println("Dividend 1 : "+getDividend1());		
		System.out.println("Dividend 2 : "+getDividend2());		
		System.out.println("Dividend 3 : "+getDividend3());
	} // print

	private static double getDividend1() {
		return getIncome() * 0.5;
	} // getDividend1
	
	private static double getDividend2() {
		return getIncome() * 0.3;
	} // getDividend2
	
	private static double getDividend3() {
		return getIncome() * 0.2;
	} // getDividend3

	private static double getIncome() {
		return valueOfSupply - getExpense();
	} // getIncome

	private static double getExpense() {
		return valueOfSupply*expenseRate;
	} // getExpense

	private static double getTotal() {
		return valueOfSupply + getVAT();
	} // getTotal()

	private static double getVAT() {
		return valueOfSupply*vatRate;
	} // getVAT

}

public class Ex06_AccountingClasspp {
	

	public static void main(String[] args) {				
		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;		  
		Accounting.print();
		// anotherVariable = ...;
		// anotherMethod = ...;
		 
	} // main

	
} // class
