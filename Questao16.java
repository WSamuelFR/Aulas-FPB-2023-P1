import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("insira seu nome e sua idade :");
		System.out.println("o console vai mostrar se voce é obrigado a votar :");

		String nome = sc.nextLine();

		int idade = sc.nextInt();

		if (idade >= 18) {
			if (idade <= 70) {
				System.out.println(nome + ":é obrigado a votar :");

			}

		} else {
			System.out.println(nome + ":não é obrigado a votar :");
			sc.close();

		}
	}

}
