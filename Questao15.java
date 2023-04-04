import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("insira uma letra para o console falar se ela é ou não uma vogal :");
		System.out.println("a - e - i - o - u :");

		String letra = sc.nextLine();

		if (letra.equalsIgnoreCase("a")) {
			System.out.println("vogal :");

		} else if (letra.equalsIgnoreCase("e")) {
			System.out.println("vogal :");

		} else if (letra.equalsIgnoreCase("i")) {
			System.out.println("vogal :");

		} else if (letra.equalsIgnoreCase("o")) {
			System.out.println("vogal :");

		} else if (letra.equalsIgnoreCase("a")) {
			System.out.println("vogal :");

		} else {
			System.out.println("consoante :");

		}
		sc.close();

	}

}
