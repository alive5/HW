//�������� ��������, ����� ������� ����� � 10 �������� �
//������������ ����� �� ���������� ��� �������� ����� �� ������� ��
//�������� ������� �� 3.
//�� �� ������� ���������� �� ������.

public class Zadacha5Inndexpo3 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int index = 0; index < arr.length; index++) {
		
			arr[index] = index*3;	
			System.out.println("index: "+index+" arr[index]: "+arr[index]);
			
		}
	}
}
