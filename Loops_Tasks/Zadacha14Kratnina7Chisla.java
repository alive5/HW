import java.util.Scanner;

//Задача 14: Да се състави програма, която по въведено
//естествено число N от интервала [10..200] извежда в обратен
//ред всички числа, които са кратни на 7 и са по-малки от N.
public class Zadacha14Kratnina7Chisla {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>9 & N<201){
			for (int M=N; M>1; M--) {
				if(M%7==0){
					System.out.println(M);
				}
			}
		}

				
		
	}

}
