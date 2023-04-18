import java.util.Scanner;

public class VetorMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[4];
		int soma = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("informe uma nota:");
			n[i] = sc.nextInt();

		}

		double media = soma / 4;
		System.out.println("a media he:" + media);

		sc.close();

	}

}
