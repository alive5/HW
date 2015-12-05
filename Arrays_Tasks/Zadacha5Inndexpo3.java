//Напишете програма, която създава масив с 10 елемента и
//инициализира всеки от елементите със стойност равна на индекса на
//елемента умножен по 3.
//Да се изведат елементите на екрана.

public class Zadacha5Inndexpo3 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int index = 0; index < arr.length; index++) {
		
			arr[index] = index*3;	
			System.out.println("index: "+index+" arr[index]: "+arr[index]);
			
		}
	}
}
