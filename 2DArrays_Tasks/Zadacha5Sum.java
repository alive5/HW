//Задача 5:
//Да се състави програма, при която предварително са въведени
//естествени числа в двумерен масив 4*4 елемента.
//Програмата да извежда резултат от проверката какво е съотношението
//на най-голямата сума по редове спрямо най-голямата сума по колони.
//Пример:
//1,2,3,4
//5,6,7,8
//9,10,11,12
//13,14,15,16
public class Zadacha5Sum {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		float maxSumRows = 0;
		float maxSumCols = 0;
		int sumCheck = 0;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				sumCheck += array[row][col];
			}
			//
			if (sumCheck > maxSumRows) {
				maxSumRows = sumCheck;
			}
			
		//	sumCheck = 0;
		//	System.out.println(sumCheck);
		}
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				sumCheck += array[col][row]; 
			}

			if (sumCheck > maxSumCols) {
				maxSumCols = sumCheck;
			}
//System.out.println(sumCheck);
			sumCheck = 0;
		}

		System.out.println("max sum by rows = " + maxSumRows);
		System.out.println("max sum by columns = " + maxSumCols);
		System.out.println("max sum by rows / max sum by columns = "+maxSumRows/maxSumCols);
	}

}
