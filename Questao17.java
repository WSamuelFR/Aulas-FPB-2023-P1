import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("escolha o sabor do sorvete :");
		System.out.println("m - morango: c = chocolate :");

		String sabor = sc.nextLine();
		int bola = sc.nextInt();
		double valor = bola * 1.50;

		if (sabor.equalsIgnoreCase("m")) {
			System.out.println("voce escolheu morango, não tem desconto! :");
			System.out.println("quantas bola voce deseja? :");
			System.out.println(bola + ":bolas, vai pagar:" + df.format(valor));

		} else if (sabor.equalsIgnoreCase("c")) {
			System.out.println("voce escolheu chocolate, possui desconto, 3 ou mais bolas 10% :");
			if (bola >= 3) {
				double divi1 = valor / 100 * 10;
				double des1 = bola - divi1;
				System.out.println(bola + ":bolas desconto 10%, vai pagar:" + df.format(des1));

			} else if (bola == 2) {
				double divi2 = valor / 100 * 5;
				double des2 = bola - divi2;
				System.out.println(bola + ":bolas desconto 5%, vai pagar:" + df.format(des2));

			} else {
				System.out.println(bola + ":bola não tem desconto, vai pagar :" + df.format(valor));
			}

		}
		sc.close();

	}

}
