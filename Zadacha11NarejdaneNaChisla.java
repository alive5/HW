import java.util.Scanner;

public class Zadacha11NarejdaneNaChisla {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int threeDigitNumber = sc.nextInt();
		
		if (threeDigitNumber>99 & threeDigitNumber<1000){
		System.out.println("Vuvedohte tricifreno chislo");
		}
		else{
		System.out.println("Vuvedete chislo mejdu 100 i 999");
		}
		
		int x = threeDigitNumber / 10;
	
		int thirdDigit = threeDigitNumber%10;
		int secondDigit = x%10;
		int firstDigit = threeDigitNumber / 100;
		
		System.out.println(firstDigit);
		

	}		
	
	
}

