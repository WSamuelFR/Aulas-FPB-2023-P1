import java.util.Scanner;

public class CriarVetorAxB {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int[] a = new int[5],  b = new int[5];
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println("informe uma nota:");
			a[i] = sc.nextInt();
			b[i] = a[i];
			
		}
		System.out.println("os valores de a s�o a");
		for (int i = 0; i < 4; i++) {
			System.out.println("posi��o" +i+ ":" + a[i]);
			
		}
		System.out.println("os valores de a s�o b");
		for (int i = 0; i < 4; i++) {
			System.out.println("posi��o" +i+ ":" + b[i]);
			
		}
		
		sc.close();
	}

}
