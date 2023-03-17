import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
        
        System.out.println("qual seu nome : ");
        String nome = leia.nextLine();
        
        System.out.println("qual o seu salario : ");
        double salario = leia.nextDouble();
        
        System.out.println("qual o valor da prestação desejado : ");
        double prestacao = leia.nextDouble();
        
        double a = salario /100 * 30;
        
        if (salario > a) {
        	System.out.println("aprovada credito senhor : " + nome);
			
		} else {
           System.out.println("reprovado credito senhor : " + nome);
		}
	}

}
