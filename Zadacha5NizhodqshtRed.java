import java.util.Scanner;

public class Zadacha5NizhodqshtRed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a<b & b<c){
		System.out.println(a + "\n " + b + " \n " + c);
		}
		 
			if(a<c & b>c){
			System.out.println( a  + " \n " + c + " \n " + b);
		
		}
		
	
			if(a>b & b>c) { 
				System.out.println( c  + " \n " + b + " \n " + a);
		}
        
			if(a>c & b>a) { 
				System.out.println( c  + " \n " + a + " \n " + b);
		}
			
			if(b>a & a>c) { 
				System.out.println( b  + " \n " + a + " \n " + c);
		}

			if(b>c & c>a) { 
				System.out.println( b  + " \n " + c + " \n " + a);
		}
			
	}
	
}
