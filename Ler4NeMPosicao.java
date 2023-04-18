import java.util.Scanner;

public class Ler4NeMPosicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[4];

		for (int i = 0; i < 3; i++) {
			System.out.println("informe uma nota:");
			n[i] = sc.nextInt();

		}

		for (int i = 0; i < 3; i++) {

			System.out.println("posição:" + i + "possui o valor:" + n[i]);

		}

		sc.close();

	}

}
