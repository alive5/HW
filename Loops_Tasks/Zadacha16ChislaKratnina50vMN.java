//D� �� ������� ��������, ���� ����� �� �������� 2 ���������� ����� N, M �� ��������� [10..5555].
//����������, ���� ����� for, �� ������� ������ ����� �� ���������, ����� �� ������ �� 50 � �������� ���.



public class Zadacha16ChislaKratnina50vMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N=10;
		for (int M = 5555; M >=N;M--) {
			if(M%50==0)
			{
				System.out.println(M);
			}
			
		}
		
	}

}
