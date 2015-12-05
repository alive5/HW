//Задача 11:
//Да се състави програма, която въвежда от клавиатурата 7 цели числа
//в едномерен масив
//Програмата да изведе всички числа кратни на 5, но по големи от 5.
//Пример: -23, -55, 17, 75, 56, 105, 134
//Изход: 75,105 2 числа


public class Zadacha11ChislaKratnina5 {
	public static void main(String[] args) {

		int[] arr =  {4,5,99,612,-445,995,115};
		
		System.out.println("Chisla ot masiva kratni na 5 : ");
		for (int index = 0; index < arr.length; index++) {
			
			if(arr[index]>5 && arr[index]%5==0){
				System.out.print(arr[index]+",");
			}
		}
	}
}
