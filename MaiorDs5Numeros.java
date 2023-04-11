import java.util.Scanner;

public class MaiorDs5Numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("informe um valor :");

		int x1 = sc.nextInt(), maior = x1, menor = x1;

		int n = 1;

		while (n <= 4) {

			System.out.println("informe um valor :");

			int x2 = sc.nextInt();

			if (x1 > maior) {

				maior = x1;

			}

			if (x2 < menor) {

				menor = x2;

			}

			n++;

		}

		System.out.println("maior :" + maior);

		System.out.println("menor :" + menor);
		
		sc.close();

	}

}
