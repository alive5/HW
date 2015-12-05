import java.util.Arrays;
import java.util.Scanner;

//Да се въведе число, след което да се създаде масив с 10
//елемента по следния начин:
//Първите 2 елемента на масива са въведеното число.
//Всеки следващ елемент на масива е равен на сбора от
//предишните 2 елемента в масива.
//След това изведете масива .
public class Zadcah3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		array[0]=n;
		array[1]=n;
		
		for (int index2 = 2; index2 < array.length; index2++) {
			
			array[index2] =array[index2-2]+array[index2-1];
		
		}
		System.out.println(Arrays.toString(array));

	}

}
