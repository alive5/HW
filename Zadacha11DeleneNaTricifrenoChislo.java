import java.io.FilterInputStream;
import java.util.Scanner;

public class Zadacha11DeleneNaTricifrenoChislo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a three digit number: ");
		
		int threeDigitNumber = sc.nextInt();
		
		if(threeDigitNumber>99 & threeDigitNumber<=999){
			System.out.println("Contunue");
			
			
					int x = threeDigitNumber/10;
			int y = x/10;
			
			int firstDigit=y%10;
			int secondDigit = x%10;
					int thirdDigit = threeDigitNumber%10;
								
			System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit );
						
			} 
		
		else {
			System.out.println("Please enter a three digit number");
		}
		
		
		System.out.println(threeDigitNumber);
		int  z = threeDigitNumber;
		
		int x = threeDigitNumber/10;
		int y = x/10;
		
		int firstDigit=y%10;
		 int secondDigit = x%10;
				int thirdDigit = threeDigitNumber%10;
		
				if (threeDigitNumber % firstDigit == 0 ) {
				System.out.println(threeDigitNumber + " se deli na " + firstDigit);
				}
				else{System.out.println(threeDigitNumber + " ne se deli na " + firstDigit );
					
				}
				
				if (threeDigitNumber % secondDigit == 0 ) {
					System.out.println(threeDigitNumber + " se deli na " + secondDigit);
					}
					else{System.out.println(threeDigitNumber + " ne se deli na " + secondDigit );
						
					}
				
				if (threeDigitNumber % thirdDigit == 0 ) {
					System.out.println(threeDigitNumber + " se deli na " + thirdDigit);
					}
					else{System.out.println(threeDigitNumber + " ne se deli na " + thirdDigit );
						
					}
		
	}
		
		

}
