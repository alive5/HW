import java.util.Scanner;

public class Zadacha3RazmqnaNaStoinosti {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		
		int z;
		int a = SC.nextInt();
		int b =SC.nextInt();
		
		System.out.println(" Before swap a = " + a + " b= " + b);
		
		z=a;
		a=b;
		b=z;
		System.out.println(" After Swap a = " + a + " b= " + b );
	}

}
