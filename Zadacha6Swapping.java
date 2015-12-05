import java.util.Scanner;

public class Zadacha6Swapping {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
		
        int x,z,y;
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();

		System.out.println("Before swap " + a1 + " " + a2 + " " + a3);
		
		y=a1;
		z=a2;
		x=a3;
		
		a1=z;
		a2=x;
		a3=y;

			
		System.out.println("After swap " + z +" " + x + " "+ y);		
	}

}
