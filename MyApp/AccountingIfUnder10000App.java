
public class AccountingIfUnder10000App {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double Vat = valueOfSupply *vatRate;
		double total = valueOfSupply + Vat;
		double expense = valueOfSupply*expenseRate;
		double Income = valueOfSupply - expense;
		
		double dividend1 = Income *1;
		double dividend2 = Income *0;
		double dividend3 = Income *0;
		
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
