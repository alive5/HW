import java.util.Scanner;

//������ 12: �� �� ������� ��������, ����� ������� ������
//���������� ���������� �����, ����� ����� ������� ����� �.�.
//100,101, 606 � �.�. �� �� ��������. 
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
