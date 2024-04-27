
public class AccountingAraryLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double Vat = valueOfSupply *vatRate;
		double total = valueOfSupply + Vat;
		double expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply - expense;
		
		
		
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT :" +Vat);
		System.out.println("Total :" + total);
		System.out.println("Expense: "+ expense);
		System.out.println("Income:"+ Income);
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend:"+ (Income*dividendRates[i]) );
			i = i + 1;
		}
		
		
	}

}
