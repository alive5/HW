import java.util.Scanner;

//	������ 17:
//	���� ������ �� ���������� ����� �� �������� �������������� ������,
//	��� �� ���������� � �� ���������� ���������:
//	N1 < N2 > N3 < N4 > N5 <..
//	��������� ��������, ����� ��������� ���� �������� � ���������
//	����� ������ �� ����� ���������� ������� ����������.
//	������: 1 3 2 4 3 7
//	�����: ��������� ������������ �� �������������� ������ ������
//	
public class Zadacha17ZigzagoobrazenMaisiv {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] array = new int[m];
		boolean Nazuben = true;

		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
			// System.out.print(array[index]+",");}
		}
		for (int index = 1; index < array.length - 1; index++) {

			if ((array[index] > array[index - 1] && array[index] > array[index + 1])
					|| (array[index] < array[index - 1] && array[index] < array[index + 1])) {
				System.out.println("zigzag");
			}

		}

	}

}
