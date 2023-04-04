import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("insira os nomes de 3 pessoas para o console apontar o mais novo :");

		System.out.println("insira o primeiro nome :");
		String nom1 = sc.nextLine();

		System.out.println("insira o segundo nome :");
		String nom2 = sc.nextLine();

		System.out.println("insira o terceiro nome :");
		String nom3 = sc.nextLine();

		System.out.println("agora coloque as idades :");
		double id1 = sc.nextDouble();
		double id2 = sc.nextDouble();
		double id3 = sc.nextDouble();

		if (id1 < id2) {

			if (id1 < id3) {
				System.out.println(nom1 + ":é o mais novo :");

			}

		}

		if (id2 < id1) {

			if (id2 < id3) {
				System.out.println(nom2 + ":é o mais novo :");

			}

		}
		if (id3 < id1) {

			if (id3 < id2) {
				System.out.println(nom3 + ":é o mais novo :");

			}

		}
		sc.close();

	}

}
