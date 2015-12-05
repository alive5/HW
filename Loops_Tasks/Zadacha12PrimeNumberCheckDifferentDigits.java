import java.util.Scanner;

//Задача 12: Да се състави програма, която извежда всички
//естествени трицифрени числа, които нямат еднакви цифри т.е.
//100,101, 606 и т.н. не се извеждат. 
public class Zadacha12PrimeNumberCheckDifferentDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
				for (int threeDigitNumber = 100; threeDigitNumber <1001; threeDigitNumber++) {
					int thirdDigit = threeDigitNumber%10;
					int secondDigit = (threeDigitNumber/10)%10;
					int firstDigit = threeDigitNumber/100;
					
					if(firstDigit!=secondDigit & secondDigit!=thirdDigit & firstDigit!=thirdDigit){
						System.out.println(threeDigitNumber);
					}
				}
		
	
				
	}

}
