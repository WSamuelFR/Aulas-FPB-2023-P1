import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.#");

		System.out.println("informe um numero : ");
		double n1 = sc.nextDouble();

		if (n1 > 100) {
			System.out.println("o valor esta entre 100 e 200 : ");
			
			if (n1 < 200) {

			} else {

			}
		} else {
			System.out.println("o valor não esta entre 100 e 200");

		}
		sc.close();
	}

}
