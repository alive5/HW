import java.util.Scanner;

public class Zadacha15ChisloOtInterval0do24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Vuvedete chas : ");
		
		int n = sc.nextInt();
		 if (n>=0 & n<=24)
		 {
			 if(n>=4 & n<=9)
				 System.out.println("Dobro Utro");
			 
			 if(n>9& n<=18)
				 System.out.println("Dobur Den");
			 
			 if((n>0 & n<4) | (n>18 & n<24))
				 System.out.println("Dobur Vecher");

		 }
 else{
		 System.out.println("Molq vuvedete chas mejdu 0 i 24");
		 }
	}

}
