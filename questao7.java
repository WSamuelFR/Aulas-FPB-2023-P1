import java.text.DecimalFormat;
import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");
        
        System.out.println("informe qual o combustivel ( gasolina 3,79R$ - alcool = 2.90R$ : ");
        String combustivel = sc.nextLine();
         
        
        System.out.println("informe quantos litros que abastecer : ");
        double litro = sc.nextDouble();
        
        double gasolina = 3.79;
        double alcool = 2.90;
        
        if ("gasolina".equals(combustivel)) {
        	double gl = (gasolina * litro);
        	System.out.println("o valor gasto é : " + df.format(gl));
			
		}
        else if ("alcool".equals(combustivel)) {
			double al = (alcool * litro);
			System.out.println("o valor gasto é : " + df.format(al));
			
		}
        
        sc.close();
        
        
        
		
	}

}
