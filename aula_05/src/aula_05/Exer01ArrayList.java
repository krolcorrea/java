package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer01ArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		int opcao = 0;

		do {

			System.out.println("1- Adicionar cor");
			System.out.println("2- Listar todas as cores adicionadas");
			System.out.println("3- Listar todas as cores em ordem crescente");
			System.out.println("0- Sair");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Adicionar cor");
				System.out.println("Qual cor deseja adicionar?: ");
				cores.add(leia.next());

				break;
			case 2:
				System.out.println("Listar as cores adicionadas ");

				if (cores.isEmpty()) {
					System.out.println("Não foram adicionadas cores!");
				} else {
					for (var xCores : cores)
						System.out.println(xCores);
				}

				break;

			case 3:

				cores.sort(null);
				System.out.println("Cores ordenadas: " + cores);

				break;
			}
		} while (opcao != 3);
		leia.close();
	}

}
