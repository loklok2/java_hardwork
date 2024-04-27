package test7777;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		double exchangeRate = 1350.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		String input = sc.nextLine();
		
		int dollarAmount = Integer.parseInt(input.split("")[0]);
		double wonAmount = dollarAmount * exchangeRate;
		
		System.out.println(dollarAmount+ "달러" + wonAmount+"원");
		

	}

}
