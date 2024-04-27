
public class AccountingIfApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double Vat = valueOfSupply *vatRate;
		double total = valueOfSupply + Vat;
		double expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply - expense;

		double dividend1 = Income *0.5;
		double dividend2 = Income *0.3;
		double dividend3 = Income *0.2;
		
		if(Income > 10000.0) {
			dividend1 = Income *0.5;
			dividend2 = Income *0.3;
			dividend3 = Income *0.2;
		} else {
			dividend1 = Income *1;
			dividend2 = Income *0;
			dividend3 = Income *0;
		}
		
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT :" +Vat);
		System.out.println("Total :" + total);
		System.out.println("Expense: "+ expense);
		System.out.println("Income:"+ Income);
		System.out.println("Dividend:"+ dividend1);
		System.out.println("Dividend:"+ dividend2);
		System.out.println("Dividend:"+ dividend3);
		
		
		
	}

}
