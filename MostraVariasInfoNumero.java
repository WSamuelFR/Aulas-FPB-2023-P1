import java.util.Scanner;

public class MostraVariasInfoNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int v1, v2, fim;
		String OP;

		do {

			System.out.println("Informe um valor:");
			v1 = sc.nextInt();
			System.out.println("informe a operação. [ + , - , * , / ].");
			OP = sc.next();
			System.out.println("Informe outro valor:");
			v2 = sc.nextInt();

			switch (OP) {
			case "+":

				int soma = v1 + v2;
				String resu1 = (soma % 2 != 0) ? "impar." : "par.";
				String resu2 = (soma != 0) ? "diferente de zero." : "igual a zero.";
				String resu3 = (soma > 0) ? "é maior que zero." : "é menor que zero.";
				System.out.println("aqui estão os resultados =>." + soma + "." + resu1 + resu2 + resu3);

				break;

			case "-":

				int sub = v1 - v2;
				String resu4 = (sub % 2 != 0) ? "impar." : "par.";
				String resu5 = (sub != 0) ? "diferente de zero." : "igual a zero.";
				String resu6 = (sub > 0) ? "é maior que zero." : "é menor que zero.";
				System.out.println("aqui estão os resultados =>." + sub + "." + resu4 + resu5 + resu6);

				break;

			case "*":

				int mult = v1 * v2;
				String resu7 = (mult % 2 != 0) ? "impar." : "par.";
				String resu8 = (mult != 0) ? "diferente de zero." : "igual a zero.";
				String resu9 = (mult > 0) ? "é maior que zero." : "é menor que zero.";
				System.out.println("aqui estão os resultados =>." + mult + "." + resu7 + resu8 + resu9);

				break;

			case "/":

				int divi = v1 / v2;
				String resu10 = (divi % 2 != 0) ? "impar." : "par.";
				String resu11 = (divi != 0) ? "diferente de zero." : "igual a zero.";
				String resu12 = (divi > 0) ? "é maior que zero." : "é menor que zero.";
				System.out.println("aqui estão os resultados =>." + divi + "." + resu10 + resu11 + resu12);

				break;

			default:

				System.out.println("operação invalida!." + OP + ":não existe no sistema.");

				break;

			}

			System.out.println("----------------------------------------------------------------");
			System.out.println("insira qualquer valor para continuar, para finalizar insira: -999");
			fim = sc.nextInt();

		} while (fim != -999);
		System.out.println("programa encerrado :).");

		sc.close();
	}

}
