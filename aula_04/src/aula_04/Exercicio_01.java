package aula_04;


import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int vetorInteiros[] = { 10, 38, 87, 55, 65, 23, 78, 41, 2, 6 };
	
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		boolean encontrado = false;
		
		for (int valor = 0; valor < vetorInteiros.length; valor++) {
			if (vetorInteiros[valor] == numero) { 
				System.out.println("Posição[" + valor + "] = " + vetorInteiros[valor]);
				encontrado = true;
			}
		}
		if (encontrado == false) {
				System.out.println(numero +  " não encontrado.");}
		
	}
}