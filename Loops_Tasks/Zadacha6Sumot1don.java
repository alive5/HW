import java.util.Scanner;

//Задача 6: Да се прочете число от екрана(конзолата) и да се
//  изведе сбора на всички числа между 1 и въведеното число
public class Zadacha6Sumot1don {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		int m = sc.nextInt();
		for(int num=1;num<=m;num++){
			sum+=num;
		
			
		}
		System.out.println(sum);
		
	}

}
