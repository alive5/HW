import java.util.Scanner;

//	Задача 17:
//	Една редица от естествени числа ще наричаме зигзагообразна нагоре,
//	ако за елементите и са изпълняват условията:
//	N1 < N2 > N3 < N4 > N5 <..
//	Съставете програма, която проверява дали въведени в едномерен
//	масив редица от числа изпълняват горните изисквания.
//	Пример: 1 3 2 4 3 7
//	Изход: изпълнява изискванията за зигзагообразна нагоре редица
//	
public class Zadacha17ZigzagoobrazenMaisiv {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] array = new int[m];
		boolean Nazuben = true;

		for (int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
			// System.out.print(array[index]+",");}
		}
		for (int index = 1; index < array.length - 1; index++) {

			if ((array[index] > array[index - 1] && array[index] > array[index + 1])
					|| (array[index] < array[index - 1] && array[index] < array[index + 1])) {
				System.out.println("zigzag");
			}

		}

	}

}
