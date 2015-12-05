import java.util.Scanner;

//3адача 19: Да се състави програма, чрез която по въведено естествено число от интервала [10..99] се извежда 
//поредица числа, при спазване на следните изисквания: 1) ако предходното число е четно се извежда 0.5*числото;
//2) ако предходното число е нечетно се извежда 3*числото +1. 



public class Zadacha19ForIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int K = sc.nextInt();
		
		
		for(;K>1;K--){
			if((K-1)%2==0){
				System.out.println("K-1= "+ (K-1) +" => K-1 e chetno => " + " 0.5*(K-1)=" +0.5*(K-1));	
			}
			if((K-1)%2==1){
				System.out.println("K-1= "+ (K-1) +" => K-1 e nechetno => "+ " (3*(K-1))+1= "+ (3*(K-1))+1);
			}
		}
//		
	}

}
