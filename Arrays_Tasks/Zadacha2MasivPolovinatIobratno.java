import java.util.Arrays;
import java.util.Scanner;

//������ 2:
//���� �� ������� ����� �� �� ���������� ���, ���� ���������� ��
//�������� �� ����� ���� �� �����������, � ������� �� �� ����
//��������, �� � ������� ���. ��������, �� �� ������ ����� �����
//�� ������.

public class Zadacha2MasivPolovinatIobratno {
	public static void main(String[] args) {

		int[] array = new int[4];
		Scanner sc = new Scanner(System.in);

		for (int index2 = 0; index2 <= array.length - 1; index2++) {
			array[index2] = sc.nextInt();
			System.out.print(array[index2] + ",");

		}
		System.out.println();
		int[] newArray = new int[4];
		for  (int index = 0; index < array.length/2; index++) {
			newArray[index] = array[index];
			System.out.print(newArray[index]+",");
		}
		for (int index = array.length/2-1; index >=0 ; index--) {
			newArray[index+2] = array[index];
			System.out.print(newArray[index]+",");
		}
		System.out.println(Arrays.toString(newArray));
			}
}
