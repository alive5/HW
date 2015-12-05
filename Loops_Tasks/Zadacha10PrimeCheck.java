import java.util.Scanner;

public class Zadacha10PrimeCheck {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive Number: ");
		int num = sc.nextInt();
		int divider = 2;    
		int maxDivider = (int) Math.sqrt(num);
		boolean prime = true;
	while (prime && (divider <= maxDivider)) {
		    if (num % divider == 0) {
		        prime = false;
		    }
		    divider++;
						}
		System.out.println("Prime? " + prime);

		
	}
}
