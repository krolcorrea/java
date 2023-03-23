package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exer01SetList {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		int numero = 0;
		Integer y = Integer.valueOf(10);

		numeros.add(y);
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		for (int in = 0; in < 1; in++) {
			System.out.println("Qual número você procura? ");
			numero = leia.nextInt();}

			if (numeros.contains(numero))
				System.out.println("O número " + numero + " existe! ");
			else
				System.out.println("O número " + numero + " não foi encontrado!");
		
			leia.close();
	}

}
