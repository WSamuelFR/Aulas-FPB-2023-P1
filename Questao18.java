import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("escolha seu grupo, g1 - grupo 1, g2 - grupo 2, g3 - grupo 3 :");

		String grupo = sc.nextLine();
		grupo = grupo.toUpperCase();
		double indice = sc.nextDouble();

		switch (grupo) {

		case "G1":

			System.out.println("escolheu grupo 1 :");

			if (indice > 0.3) {

				if (indice < 0.25) {

				}

				System.out.println("indice não estavel, encerrar atividade :");

			} else {

				System.out.println("indice estavel, manter atividade");

			}

			break;

		case "G2":

			System.out.println("escolha caso 2 :");

			if (indice > 0.4) {

				if (indice < 0.25) {

				}

				System.out.println("indice não estavel, encerrar atividade :");

			} else {

				System.out.println("indice estavel, manter atividade");

			}

			break;

		case "G3":

			System.out.println("escolheu grupo 3 :");

			if (indice > 0.5) {

				if (indice < 0.25) {

				}

				System.out.println("indice não estavel, encerrar atividade :");

			} else {

				System.out.println("indice estavel, manter atividade");

			}
			
			break;

		}

		sc.close();

	}

}
