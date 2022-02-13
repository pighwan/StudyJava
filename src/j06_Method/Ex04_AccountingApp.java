package j06_Method;

public class Ex04_AccountingApp {
	public static double valueOfSupply = 10000.0; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율
	
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public static void main(String[] args) {				
		
		double expenseRate = 0.3;	
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		  
		System.out.println("Value of supply : "+valueOfSupply); // 공급가			
		System.out.println("VAT : "+getVAT()); // 부가가치세		
		System.out.println("Total : "+getTotal()); // 합계		
		System.out.println("Expense : "+expense); 		
		System.out.println("Income : "+income); // 전체 수익		
		System.out.println("Dividend 1 : "+dividend1);		
		System.out.println("Dividend 2 : "+dividend2);		
		System.out.println("Dividend 3 : "+dividend3);
		
		 
	} // main

} // class
