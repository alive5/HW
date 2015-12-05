import java.util.Scanner;

public class factioriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* 	Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// "long" is the biggest integer type
		long factorial = 1;
		// Perform an “infinite loop"
		while (true) {
		    if (n == 1) {
		        break;
		    }
		    factorial *= n;
		    n--;
		}
		System.out.println("n! = " + factorial);

		
	}

}
*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		long factorial = 1;
		do {
		    // Multiply to become next value of factorial
		    factorial *= n;
		    // Decrement n to get next number
		    n--;
		} while (n > 0); // Check the loop condition
		System.out.println("n! = " + factorial);
		
		
		for (int small=1, large=10; small<large; small++, large--) {
		    System.out.printf("%d %d\n", small, large);
		}
		
	}
}
