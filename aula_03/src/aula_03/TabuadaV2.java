package aula_03;

import java.util.Scanner;

public class TabuadaV2 {
	public static void main(String[] args) {
		
		int numero, contador=1;
		Scanner leia = new Scanner(System.in);

			System.out.println("Digite a Tabuada que você deseja calcular: ");
			numero = leia.nextInt();
			
		while(contador <=10) {
		System.out.println(numero + "x" + contador + "=" + numero * contador);
		};

}}
