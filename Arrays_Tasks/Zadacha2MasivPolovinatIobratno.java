import java.util.Arrays;
import java.util.Scanner;

//Задача 2:
//Нека по въведен масив да се конструира нов, като половината му
//елементи са точно като на оригиналния, а другите да са тези
//елементи, но в обратен ред. Последно, да се изведе новия масив
//на екрана.

public class Zadacha2MasivPolovinatIobratno {
	public static void main(String[] args) {

		int[] array = new int[4];
		Scanner sc = new Scanner(System.in);

		for (int index2 = 0; index2 <= array.length - 1; index2++) {
			array[index2] = sc.nextInt();
			System.out.print(array[index2] + ",");

		}
		System.out.println();
		int[] newArray = new int[4];
		for  (int index = 0; index < array.length/2; index++) {
			newArray[index] = array[index];
			System.out.print(newArray[index]+",");
		}
		for (int index = array.length/2-1; index >=0 ; index--) {
			newArray[index+2] = array[index];
			System.out.print(newArray[index]+",");
		}
		System.out.println(Arrays.toString(newArray));
			}
}
