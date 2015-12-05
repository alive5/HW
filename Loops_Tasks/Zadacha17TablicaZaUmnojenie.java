import java.util.Scanner;

//Задача 18: Да се състави програма, чрез която се въвежда две числа от интервала [1..9].
//Програмата да извежда таблицата за умножение. Максималната стойност на множителите е определена от 2-те числа
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

