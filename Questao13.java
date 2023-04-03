import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("insira dois valores a serem divididos :");

		System.out.println("insira o primeiro valor :");
		double v1 = sc.nextDouble();
		System.out.println("insira o segundo valor :");
		double v2 = sc.nextDouble();

		if (v1 % v2 == 0) {
			System.out.println("a sua divisão é igual a zero! :");

		} else
			System.out.println("sua divisão não é igual a zero :");

		sc.close();
	}

}
