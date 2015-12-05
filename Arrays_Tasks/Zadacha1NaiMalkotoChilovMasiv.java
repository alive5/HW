import java.util.Scanner;

//«адача 1:
//ƒа се прочете масив и да се намери най-малкото число кратно на
//3 от масива.

public class Zadacha1NaiMalkotoChilovMasiv {

	public static void main(String[] args) {

		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int index = 0; index <= a.length - 1; index++) {
			a[index] = sc.nextInt();
			System.out.print(a[index] + ",");
		}
		System.out.println();

		int min = a[0];
		for (int index = 0; index <= a.length - 1; index++) {

			if (a[index] < min) {
				min = a[index];
			}
			if (a[index] % 3 == 0) {
				System.out.println("Chislata koito se delqt na 3 sa:");
				System.out.println(a[index] + ",");
		}
		}
		System.out.println("Min e : "+min);
	
	}
}
