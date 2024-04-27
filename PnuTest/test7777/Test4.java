package test7777;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String input = sc.nextLine();
		
		String[] numbers = input.split(",");
		int firstNumber = Integer.parseInt(numbers[0]);
		int secondNumber = Integer.parseInt(numbers[1]);
		
		System.out.println("곱:" + firstNumber * secondNumber);
		System.out.println("몫:" + firstNumber / secondNumber);
		System.out.println("나머지:"+ firstNumber % secondNumber);
		
		
		
		
		

	}

}
