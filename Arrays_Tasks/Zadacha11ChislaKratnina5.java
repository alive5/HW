//������ 11:
//�� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
//� ��������� �����
//���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
//������: -23, -55, 17, 75, 56, 105, 134
//�����: 75,105 2 �����


public class Zadacha11ChislaKratnina5 {
	public static void main(String[] args) {

		int[] arr =  {4,5,99,612,-445,995,115};
		
		System.out.println("Chisla ot masiva kratni na 5 : ");
		for (int index = 0; index < arr.length; index++) {
			
			if(arr[index]>5 && arr[index]%5==0){
				System.out.print(arr[index]+",");
			}
		}
	}
}
