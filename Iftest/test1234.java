import java.sql.SQLOutput;

public class test1234 {
	
	public static void main(String[] args) {
		
//		for( 선언 ; 조건 ; 증감 ) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("*");	
			}
			System.out.println();
		}
		System.out.println("-------------");	
		
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}