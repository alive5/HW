import java.util.Scanner;

//������ 13: �� �� ������� ��������, ����� ������� ������
//���������� ���������� �����, ����� ���� ���� �� ������� �����
//�� ������ �����.

public class Zadacha13TricifreniChislaSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
int sborNaCifrite = sc.nextInt();

		for (int threeDigitNumber = 100; threeDigitNumber < 1001; threeDigitNumber++) {
			int thirdDigit = threeDigitNumber%10;
			int secondDigit = (threeDigitNumber/10)%10;
			int firstDigit = threeDigitNumber/100;
			
			if(firstDigit+secondDigit+thirdDigit==sborNaCifrite){
				System.out.println(threeDigitNumber);
			}
			
		}
	}
}
