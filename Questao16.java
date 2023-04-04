import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("insira seu nome e o ano de nascimento :");
		System.out.println("o console vai mostrar se voce é obrigado a votar :");

		String nome = sc.nextLine();

		int ano = sc.nextInt();

		int idade = 2014 - ano;

		if (idade >= 18) {
			if (idade <= 70) {
				System.out.println(nome + ":" + idade + ":voto é obrigatorio:");

			}

		} else {
			System.out.println(nome + ":" + idade + ":voto nãe é obrigatorio :");
		}
		sc.close();
	}

}
