import java.util.Scanner;


public class QuestaoResto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
        
        System.out.println("informe um valor :");
        int n1 = leia.nextInt();
        
        if (n1 % 2 == 0) {
        	System.out.println(n1 + " é par");
			
		} else {
			System.out.println(n1 + " é impar");

		}
	}

}
