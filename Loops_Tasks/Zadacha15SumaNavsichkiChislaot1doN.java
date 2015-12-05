import java.util.Scanner;

//Задача 15: Да се състави програма, която да изчисли сумата на
//всички числа от 1 до въведено число N.

public class Zadacha15SumaNavsichkiChislaot1doN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=1;
		
		for(int N=sc.nextInt();N>1;N--){
		do
		{
			sum+=N;
		}
		while(N==1);
		
		}
		System.out.println("сумата на всички числа от 1 до въведено число e "+sum);
		
	}
}
