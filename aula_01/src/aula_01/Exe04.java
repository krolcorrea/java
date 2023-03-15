package aula_01;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		float n1, n2, n3, n4;
		
		System.out.println("Insira o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Insira o segundo número: ");
		n2 = leia.nextFloat();
		
		System.out.println("Insira o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Insira o quarto numero: ");
		n4 = leia.nextFloat();
		
		System.out.println("O produto entre os dois primeiros numeros, e os dois últimos resulta em uma diferença de: " + ((n1*n2) - (n3*n4)));

	}

}
