import java.util.Arrays;
import java.util.Scanner;

//������ 1:
//����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
//�������� �������������.
//�� �� ������� ��������, ���� ����� �� �������� ���������� �� ������
//� ���-������� � ���-�������� ��������.
//������:
//48,72,13,14,15
//21,22,53,24,75
//31,57,33,34,35
//41,95,43,44,45
//59,52,53,54,55
//61,69,63,64,65
//�����:
//���-����� 13;
//���-������ 95

public class Zadacha1NaiMalkaNaiGolqmaStoinost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] array = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
		int max = Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				// System.out.print(array[row][col] + " ");
				if (array[row][col] > max) {
					max = array[row][col];
				}
				if(array[row][col]<min){
					min=array[row][col]	;
				}
			}
		}
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col]+ " ");
			}System.out.println();
		}
		System.out.println("Nai-golqmoto chislo e :"+max);	
		System.out.print("Nai-malkoto chislo e :"+min);
//		System.out.println(Arrays.deepToString(array));
	}

}
