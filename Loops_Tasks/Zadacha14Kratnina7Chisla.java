import java.util.Scanner;

//������ 14: �� �� ������� ��������, ����� �� ��������
//���������� ����� N �� ��������� [10..200] ������� � �������
//��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.
public class Zadacha14Kratnina7Chisla {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>9 & N<201){
			for (int M=N; M>1; M--) {
				if(M%7==0){
					System.out.println(M);
				}
			}
		}

				
		
	}

}
