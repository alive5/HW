import java.util.Scanner;

//������ 18: �� �� ������� ��������, ���� ����� �� ������� ��� ����� �� ��������� [1..9].
//���������� �� ������� ��������� �� ���������. ������������ �������� �� ����������� � ���������� �� 2-�� �����
public class Zadacha17TablicaZaUmnojenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int K = sc.nextInt();


		for(int N = sc.nextInt();N>0;N--)
		{
			for(;K>0;K--){
			

			System.out.println("K*N="+K+"*"+N+" = "+K*N);
			}N--;
		}
	}
}

