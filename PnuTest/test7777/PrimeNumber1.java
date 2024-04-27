package test7777;

import java.util.Scanner;

public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Number[0:exit]:");
			int num = sc.nextInt();
			if(num == 0) break;
			if(isPrime(num) == true) {
				System.out.println(num + "is a Prime.");
			}else {
				System.out.println(num + "is not a Prime.");
			}
			
		}
		sc.close();
		System.out.println("Done!");
	}
	//num이 소수면 true, 그렇지 않으면 false를 리턴
	private static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		if(num % 2 == 0) {
			return false;
		}
		for(int i = 3; i * i <= num; i += 2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}	
	
}