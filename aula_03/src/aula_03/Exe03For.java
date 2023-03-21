package aula_03;

import java.util.Scanner;

public class Exe03For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int par = 0, impar = 0;
		int numero;

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "° número");
			numero = leia.nextInt();

			if (numero % 2 == 0)
				par++;
			else
				impar++;
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
	}

}
