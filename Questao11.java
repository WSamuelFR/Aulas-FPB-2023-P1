import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("informe m ou f para que o console mostre seu sexo :");
		System.out.println("m - masculino :");
		System.out.println("f - feminino :");
		String sexo = sc.next();
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("maculino :");
			
		}
		else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("feminino :");
			
		}
		else {
			System.out.println("não registrado :");
			
		}
        sc.close();
           
	}

}
