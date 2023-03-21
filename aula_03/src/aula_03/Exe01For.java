package aula_03;

import java.util.Scanner;

public class Exe01For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int nInicial, nFinal;
		
		System.out.println("Por favor, digite o número onde começara o intervalo: ");
		nInicial = leia.nextInt();
		System.out.println("Por favor, digite o número onde terminará o intervalo: ");
		nFinal = leia.nextInt();
		
		if(nInicial > nFinal) {
			System.out.println("Intervalo Inválido.");
		}
		
		for(int contador = nInicial; contador <= nFinal; contador++ )
		
			if(contador%3 == 0 && contador%5 == 0)
				System.out.println(contador + " é multiplo de 5 e 3.");

		


	}

}
