package j05_MyApp;

public class Ex04_AccountingArrayLoopApp {

	public static void main(String[] args) {
				
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1; // 부가 가치세
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;	
		  
		System.out.println("Value of supply : "+valueOfSupply); // 공급가			
		System.out.println("VAT : "+vat); // 부가가치세		
		System.out.println("Total : "+total);			
		System.out.println("Expense : "+expense); 		
		System.out.println("Income : "+income); // 전체 수익	
		
		double[] dividendRates = new double[3];  // 배열을 이용해서 정리정돈 하기!
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : "+ (income * dividendRates[i]));	
			i = i + 1;
		}
		
		 
	} // main

} // class
