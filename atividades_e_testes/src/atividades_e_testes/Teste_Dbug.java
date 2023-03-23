package atividades_e_testes;

import java.util.Scanner;

public class Teste_Dbug {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorInteiros = new int[5];

		
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetorInteiros[indice] = leia.nextInt();
		}

		for (int contador = 0; contador < vetorInteiros.length; contador++)
			System.out.println("posição " + contador + " = " + vetorInteiros[contador]);
		
		leia.close();

	}

}
