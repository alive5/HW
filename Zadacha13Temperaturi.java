import java.util.Scanner;

public class Zadacha13Temperaturi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println(" Vuvedete temperatura v Celzii : ");
		
		int t = sc.nextInt();
		
		if(t<20){
			System.out.println("Ledeno Studeno");
		}
		if(t>-20 & t<0){
			System.out.println("Studeno");
		}
		if(t>0 & t<15){
			System.out.println("Hladno");
		}
		if(t>15 & t<25){
			System.out.println("Toplo");
					}
	    if(t>25){
	    	System.out.println("Goreshto");
	    }
	}

}
