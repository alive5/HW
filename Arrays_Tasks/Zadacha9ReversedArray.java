import java.util.Scanner;

public class Zadacha9ReversedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] reversedArr = new int[arr.length];
		System.out.println("Originalen Masiv: ");
		for (int index = 0; index < arr.length; index++) {

			arr[index] = sc.nextInt();
			System.out.print(arr[index] + ",");
		}
		System.out.println();
		System.out.println("Oburnatiq masiv :");
		
		int index2 = 0;
		for(;index2<arr.length;index2++){
			reversedArr[index2]=arr[n-index2-1];
			System.out.print(reversedArr[index2]+",");	
		}
		System.out.println();
		System.out.println("Oburnatiq masiv v reda na originalniq : ");
		int index3 = n-1;
		for (; index3 >= 0; index3--) {
			reversedArr[index3]=arr[n-index3-1];
			System.out.print(reversedArr[index3]+",");
		}

	}

}
