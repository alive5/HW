import java.util.Scanner;

public class Zadacha7ChasPari {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete Chas : ");
		float chas= sc.nextFloat();
		if(chas>= 00.00 && chas <= 23.59){
			System.out.println("Veren chas");
			
		}
		else{ 
			System.out.println("Vuvedete chas mejdu 00.00 i 23.59");
		}
System.out.println("Vuvedete Pari : ");
		float money = sc.nextFloat();
		
		
		boolean zdravLiSam = sc.nextBoolean();
		
		if(zdravLiSam = false){
			
		System.out.println("Bolen sum, nqma da izlizam");

		}
		if(zdravLiSam=true){
			System.out.println("Zdrav sam");
		}
		
		if(zdravLiSam=false & money> 10){
			System.out.println("Imam pari i shte si kupq lekarstva");
		}
		if(zdravLiSam=false & money<10){
			System.out.println("Nqmam pari, shte piq chai vkushti");	
		}
		
		if(zdravLiSam=true & money>10 ){
			System.out.println("Shte otida na kino s priqteli");
		}
		if(zdravLiSam=true & money<10){
			System.out.println("Ako imam pod 10lv, Shte hodq na kafe");
		}
		
		
	}
}