import java.util.Scanner;

//������ 1:
//�� �� ������� ����� � �� �� ������ ���-������� ����� ������ ��
//3 �� ������.

public class Zadacha1NaiMalkotoChilovMasiv {

	public static void main(String[] args) {

		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int index = 0; index <= a.length - 1; index++) {
			a[index] = sc.nextInt();
			System.out.print(a[index] + ",");
		}
		System.out.println();

		int min = a[0];
		for (int index = 0; index <= a.length - 1; index++) {

			if (a[index] < min) {
				min = a[index];
			}
			if (a[index] % 3 == 0) {
				System.out.println("Chislata koito se delqt na 3 sa:");
				System.out.println(a[index] + ",");
		}
		}
		System.out.println("Min e : "+min);
	
	}
}
