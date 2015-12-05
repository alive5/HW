import java.util.Arrays;
import java.util.Scanner;

//Задача 7:
//Напишете програма, която първо чете масив и после създава нов
//масив със същия размер по следния начин: стойността на всеки
//елемент от втория масив да е равна на сбора от предходния и
//следващият елемент на съответния елемент от първия масив.
//Да се изведе получения масив.

public class Zadacha7MasiviSEdnakuvRazmer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for (int index = 0; index < arr.length; index++) {
		arr[index]=sc.nextInt();
		System.out.print(arr[index]+",");
			
		}
		int[] arr2 = new int[7];
;
		System.out.println();
		for (int index = 1; index < arr.length-1; index++) {
		
			arr2[index]=arr[index]+arr[index+1];
		
			
			System.out.print(arr2[index]+",");
}
		System.out.println(Arrays.toString(arr2));
	}

}
