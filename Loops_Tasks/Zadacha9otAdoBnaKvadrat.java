import java.util.Scanner;

//�� �� �������� 2 ����� �� ������������ � � �.
//�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
//�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
//������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
//������������) ����� ��-������ �� 200, �� �� �������� �����������.

public class Zadacha9otAdoBnaKvadrat {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		if (A <= B) {
			for (; A <= B; A++) {
				
				

				// int sum=0;
				// int A=sc.nextInt();

				// int B = sc.nextInt();
				// for(;A<=B;A++){
				// sum+=A;

				// if ((((((A * A) % 3) == 1) || (((A * A) % 3) == 2)))) {
				if (((A * A) % 3) != 0) {
					if ((sum += (A*A)) > 200) {
						break;

					}
					
					System.out.println(A * A);

				}
				if (((A * A) % 3) == 0) {
					System.out.println(A * A + " - " + "skip 3");
				}
			}
		} else {
			System.out.println("A should be greater than B");
		}
	}

}
