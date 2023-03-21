import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe um numero : ");
        double n1 = sc.nextDouble();
        System.out.println("informe outro numero : ");
        double n2 = sc.nextDouble();
        
        if (n1 == n2) {
        	System.out.println("os numeros são iguais : ");
			
		} else {
			System.out.println("os numeros não são iguais : ");
			if (n1 > n2) {
				System.out.println("o primeiro numero e maior : ");
				
			} else {
				System.out.println("o segundo numero é maior");

			}
			
			sc.close();

		}
	}

}
