import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");

		System.out.println("nome do aluno : ");
		String aluno = sc.nextLine();

		System.out.println("informe nota 1 : ");
		double n1 = sc.nextDouble();

		System.out.println("informe nota 2 : ");
		double n2 = sc.nextDouble();

		System.out.println("informe nota 3 : ");
		double n3 = sc.nextDouble();

		double media = (n1 + n2 + n3) / 3;

		if (media >= 7.0) {
			System.out.println("aprovado : " + aluno);
			if (media <= 4) {
				System.out.println("reprovado : " + aluno);

			}
		} else if (media >= 5) {
			if (media <= 6) {
				System.out.println("recuperação : " + aluno);

			}

		}

		sc.close();

	}

}
