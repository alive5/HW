import java.util.Scanner;

//Да се състави програма, която въвежда в едномерен масив реални
//числа.
//Като изход: програма извежда онези 3 различни числа, чиято
//абсолютна стойност формира максималната обща сума.
//Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
//Изход: 5.1; 6.34; 7.13
public class ZADACHA15aBSOLUTNAsTOINOST {
	public static void main(String[] args) {

		float[] a = new float[5];
		Scanner sc = new Scanner(System.in);

		for (int index = 0; index <= a.length - 1; index++) {
			a[index] =sc.nextFloat();
		}

		float max =Float.MIN_VALUE;
		float max2 = Float.MIN_VALUE;
		float max3 = Float.MIN_VALUE;
		for (int index = 0; index <= a.length-1 ; index++) {
			if (a[index] > max) {
				max = a[index];
			}

			for (int index2 = 0; index2 <= a.length -1; index2++) {
				if (a[index2] < max && a[index2] >= max2) {
					max2 = a[index2];
				}
			}
			for (int index3 = 0; index3 <= a.length - 1; index3++) {
				if (a[index3] < max2 && a[index3] >= max3) {
					max3 = a[index3];
				}
			}

		}
		System.out.println(max);
		System.out.println(max2);
		System.out.println(max3);
	}
}