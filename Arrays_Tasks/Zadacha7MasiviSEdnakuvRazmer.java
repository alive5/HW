import java.util.Arrays;
import java.util.Scanner;

//������ 7:
//�������� ��������, ����� ����� ���� ����� � ����� ������� ���
//����� ��� ����� ������ �� ������� �����: ���������� �� �����
//������� �� ������ ����� �� � ����� �� ����� �� ���������� �
//���������� ������� �� ���������� ������� �� ������ �����.
//�� �� ������ ��������� �����.

public class Zadacha7MasiviSEdnakuvRazmer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for (int index = 0; index < arr.length; index++) {
		arr[index]=sc.nextInt();
		System.out.print(arr[index]+",");
			
		}
		int[] arr2 = new int[7];
;
		System.out.println();
		for (int index = 1; index < arr.length-1; index++) {
		
			arr2[index]=arr[index]+arr[index+1];
		
			
			System.out.print(arr2[index]+",");
}
		System.out.println(Arrays.toString(arr2));
	}

}
