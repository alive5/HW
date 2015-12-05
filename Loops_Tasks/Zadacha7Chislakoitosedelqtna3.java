import java.util.Scanner;

//	Задача 7: Започвайки от 3, да се изведат на екрана първите n
//числа които се делят на 3. Числата да са разделени със запетая

public class Zadacha7Chislakoitosedelqtna3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m = sc.nextInt();
		int num=3;
				if(num<m){
		for(;num<m;num+=3)
		{
			if(num%3==0){
				System.out.println(num);
			}
		}
				}
			else{
			System.out.println("error");
		}
		}
		
	}

