import java.util.Arrays;

//�� �� ������� ��������, ���� ����� �� ������������� �������� 7
//����� � ��������� ����� �� �������� ������� �� �������� � �������:
//- 0 � 1 ���� ����� ����������;
//- 2 � 3 ���� ��������;
//- 4 � 5 ���� ���������
public class Zadacha12RazmenqneNaIndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 5, 99, 612, -45, 9, 115 };
int x = 665;
		for (int index = 0; index < arr.length; index++) {
       System.out.print(arr[index]+",");
		}
		System.out.println();
		arr[1]=arr[0]=x;
		arr[3]=arr[2]=arr[2]+arr[3];
		arr[4]=arr[5]=arr[4]*arr[5];
		System.out.println(Arrays.toString(arr));
	}

}
