
public class AccountingAraryApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double Vat = valueOfSupply *vatRate;
		double total = valueOfSupply + Vat;
		double expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply - expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = Income * dividendRates[0];
		double dividend2 = Income * dividendRates[1];
		double dividend3 = Income * dividendRates[2];
		
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
