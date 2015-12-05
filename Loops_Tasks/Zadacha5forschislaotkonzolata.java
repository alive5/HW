import java.util.Scanner;

public class Zadacha5forschislaotkonzolata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1<=num2){

		for (; num1 <= num2; num1++) {
			System.out.println(num1);
		
		}
		}
		else{
			System.out.println("vuvedete num1 <= num2");
		}


	}

}
