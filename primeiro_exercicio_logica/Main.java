package primeiro_exercicio_logica;

import java.util.Scanner;
public class Main {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio , pi, area ;
		
			System.out.println("DIGITE O RAIO. EXEMPLO: 2,0:    ");
		raio = sc.nextDouble();
		pi = 3.14159f;
		area = ((raio * raio) * pi);
		
			System.out.printf("A=%.4f%n" , area );
		
	}

}
