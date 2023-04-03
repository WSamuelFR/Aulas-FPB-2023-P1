import java.util.Scanner;

public class TestaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		System.out.println("informe um numero  : ");
		int n1 = sc.nextInt();
		
		System.out.println("informe um numero  : ");
		int n2 = sc.nextInt();


		if (n1 > 100) {
			if (n1 < 200) {
				
				System.out.println("esta entre 100 e 200!!! : ");
				
			} else {
				if (n2 > n1) {
					System.out.println(n2 + "é maior que : " + n1);
					
				}else {
					System.out.println("são iguais !!! : ");
				}
			}

		}
		
		sc.close();
	}

}
