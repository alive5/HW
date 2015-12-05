import java.util.Scanner;

//Задача 2:
//Имате квадратен двумерен масив от естествени числа, чийто стойности
//се въвеждат. Да се отпечатат диагоналите на масива.
//Пример:
//1,4,6,3
//5,9,7,2
//4,8,1,9
//2,3,4,5
//Изход:
//1 9 1 5
//3 7 8 2
public class Zadacha2DiagonaliOtpechatvane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3,4,5,6};
		System.out.println(array.length);

		int[][] arr = new int[4][4];
		Scanner sc = new Scanner(System.in);

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {

				arr[row][col] = sc.nextInt();

				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		for (int row1 = 0; row1 < arr.length; row1++) {
			for (int col = 0; col < arr[row1].length; col++) {
				if (row1 == col) {
					System.out.println(arr[row1][col]);
				}

			}
		}
		System.out.println();
		
		for (int row1 = 0; row1 < arr.length; row1++) {
			for (int col =0; col< arr.length ; col++) {
				if(arr[row1]==arr[(arr.length-col-1)]){
					System.out.println(arr[row1][col]);
				}
				}
			}
	
	System.out.println(arr.length);		
	

	}

}