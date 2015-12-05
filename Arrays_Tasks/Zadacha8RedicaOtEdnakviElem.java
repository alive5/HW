import java.util.Scanner;

//Напишете програма, която намира и извежда най-дългата редица от
//еднакви поредни елементи в даден масив.

public class Zadacha8RedicaOtEdnakviElem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int index = 0; index < arr.length; index++) {
			
			arr[index]=sc.nextInt();
			System.out.print(arr[index]+",");
		}
		System.out.println();
		
		int index2 = 1;
		for (; index2 < arr.length; index2++) {
			if(arr[index2]==arr[index2-1]){
				System.out.print(arr[index2-1]+ "," );
			}
		}
			//if(arr[index2]!=arr[index2-1]){
				//System.out.println("Nqma posledovatelni ravni chisla");
			//}
			
		}
	}
