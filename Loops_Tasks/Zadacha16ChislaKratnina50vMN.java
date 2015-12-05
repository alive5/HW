//Dа се състави програма, чрез която се въвеждат 2 естествени числа N, M от интервала [10..5555].
//Програмата, чрез цикъл for, да извежда всички числа от интервала, които са кратни на 50 в низходящ ред.



public class Zadacha16ChislaKratnina50vMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N=10;
		for (int M = 5555; M >=N;M--) {
			if(M%50==0)
			{
				System.out.println(M);
			}
			
		}
		
	}

}
