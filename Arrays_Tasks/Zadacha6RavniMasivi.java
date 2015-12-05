import java.util.Arrays;
import java.util.Scanner;

//Задача 6:
//Напишете програма, която първо чете 2 масива и после извежда
//съобщение дали са еднакви, и дали са с еднакъв размер.

public class Zadacha6RavniMasivi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first array length: ");
		int n = sc.nextInt();
		System.out.print("Enter second array length: ");
		int m = sc.nextInt();

		int[] array = new int[n];

		int[] array2 = new int[m];
		if (m == n) {
			System.out.println("Masivite imat ednakva duljina");
			int index = 0;
			for (; index < array.length; index++) {
				System.out.print("vuvedete chislo ot purviq masiv: " + array[index]);
				array[index] = sc.nextInt();
				System.out.print("vuvedete chislo ot vtoriq masiv: " + array2[index]);
				array2[index] = sc.nextInt();

				if (array[index] != array2[index]) {

					System.out.println("Chisla s ednakuv index ne sa ravni=>masiva ne e ednakuv");
					break;
				}
				if (array[index] == array2[index]) {
					System.out.println("Ravni sa");

				}
				System.out.println(Arrays.toString(array));
				System.out.println(Arrays.toString(array2));

			}

		} else {
			System.out.println("nqmat ednakva duljina=> ne sa i ednakvi");

		}
	}

}
