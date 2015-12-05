
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Zadavha25Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int factorial = sc.nextInt();
		int sum=1;
		
		//for(;factorial>0;factorial--){
		do{
			sum*=factorial;
			factorial--;
							}
		while(factorial>1); 
	
		
	System.out.println(sum);

	}
}