import java.util.Scanner;

//������ 15: �� �� ������� ��������, ����� �� ������� ������ ��
//������ ����� �� 1 �� �������� ����� N.

public class Zadacha15SumaNavsichkiChislaot1doN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=1;
		
		for(int N=sc.nextInt();N>1;N--){
		do
		{
			sum+=N;
		}
		while(N==1);
		
		}
		System.out.println("������ �� ������ ����� �� 1 �� �������� ����� e "+sum);
		
	}
}
