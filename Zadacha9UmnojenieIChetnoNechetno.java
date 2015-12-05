import java.util.Scanner;

public class Zadacha9UmnojenieIChetnoNechetno {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Molq vuvedete dve polojitelni dvucifreni chisla");
		
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				int Proizvedenie = a*b;
				System.out.println(" a*b="+Proizvedenie);
				
				int poslednaCifra = Proizvedenie%10;
				System.out.println("Poslednata cifra e : " + poslednaCifra);
				if (Proizvedenie % 2 == 0)
				{
					System.out.print(" Chetno");
				}
				else{
					System.out.println(" Nechetno");
				}
		
		
}
	
}
