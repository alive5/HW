import java.util.Scanner;

public class MasiviSymmetryCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("print array length");

		int n = sc.nextInt();
		int[] intArray = new int[n];
		for (int i = 0; i < intArray.length; i++) {

			System.out.println("Enter number :  " + i + " - ");

			intArray[i] = sc.nextInt();
		}
		boolean isSymmetric = true;
		for (int i = 0; i < intArray.length / 2; i++) {
			if (intArray[i] != intArray[n - 1 - i]) {
				isSymmetric = false;
				System.out.println("Not symmetric");
				break;

			}if(isSymmetric=true){
			System.out.println("The array is symmetric: " + isSymmetric);
			break;
			}
		}

	}

}
