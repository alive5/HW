import java.util.Arrays;
import java.util.Scanner;

//�� �� ������ �����, ���� ����� �� �� ������� ����� � 10
//�������� �� ������� �����:
//������� 2 �������� �� ������ �� ���������� �����.
//����� ������� ������� �� ������ � ����� �� ����� ��
//���������� 2 �������� � ������.
//���� ���� �������� ������ .
public class Zadcah3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		array[0]=n;
		array[1]=n;
		
		for (int index2 = 2; index2 < array.length; index2++) {
			
			array[index2] =array[index2-2]+array[index2-1];
		
		}
		System.out.println(Arrays.toString(array));

	}

}
