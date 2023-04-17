import java.util.Scanner;

public class LerNumeroSOMAePara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, valor = 0;
		
		do {
			
			valor = sc.nextInt();
			
			soma += valor;
			
			System.out.println("a soma he :" + soma);
			
			
		} while (valor != 0);
		
		System.out.println("o programa acabou!!!!! :");
		
		
		sc.close();

	}

}
