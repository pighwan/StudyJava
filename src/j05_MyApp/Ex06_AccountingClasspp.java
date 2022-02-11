package j05_MyApp;

// method : 서로 연관된 코드를 모아서 정리정돈하는 상자!

class Accounting{
	// instance를 사용하기 위해 기존에 public static ~~~로 써주었던 것에서 static을 빼야함
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public void print() {
		System.out.println("Value of supply : "+valueOfSupply); // 공급가			
		System.out.println("VAT : "+getVAT()); // 부가가치세		
		System.out.println("Total : "+getTotal());			
		System.out.println("Expense : "+getExpense()); 		
		System.out.println("Income : "+getIncome()); // 전체 수익		
		System.out.println("Dividend 1 : "+getDividend1());		
		System.out.println("Dividend 2 : "+getDividend2());		
		System.out.println("Dividend 3 : "+getDividend3());
	} // print

	private double getDividend1() {
		return getIncome() * 0.5;
	} // getDividend1
	
	private double getDividend2() {
		return getIncome() * 0.3;
	} // getDividend2
	
	private double getDividend3() {
		return getIncome() * 0.2;
	} // getDividend3

	private  double getIncome() {
		return valueOfSupply - getExpense();
	} // getIncome

	private double getExpense() {
		return valueOfSupply*expenseRate;
	} // getExpense

	private double getTotal() {
		return valueOfSupply + getVAT();
	} // getTotal()

	private double getVAT() {
		return valueOfSupply*vatRate;
	} // getVAT
}


public class Ex06_AccountingClasspp {	

	public static void main(String[] args) {				
//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;		  
//		Accounting.print();
//		// ... 
//		Accounting.valueOfSupply = 20000.0;
//		Accounting.vatRate = 0.05;
//		Accounting.expenseRate = 0.2;
//		Accounting.print();
//		// ...
//		Accounting.print();
//		
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;		  
//		Accounting1.print();
//		// ... 
//		Accounting2.valueOfSupply = 20000.0;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
//		// ...
//		Accounting1.print();
		
		// instance 사용
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
		
	} // main

	
} // class
