
public class REVERSED {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		// arr length=6 za naobratno 6-1-i ,ako i =4 => 6 -1-5 =0 => tova e 1riq
		// elem, t.e 6
		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr[i]+",");

			System.out.print(arr[arr.length - 1 - i] + ",");

		}
//		System.out.println();
//		for(int j = arr.length-1;j>=0;j--){
//			System.out.print(arr[j] + " ");
//		}
		
		System.out.println();
		int sum =0;	
		for(int num : arr){
	
			System.out.print(num+ " +");
		sum +=num;
		}
		System.out.println("="+sum);
	}

}
