package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer01A_L_F {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int in=0; in<5; in++) {
			System.out.println("Por favor,uma por vez, adicione as 5 cores desejadas: ");
		cores.add(leia.next()); }
		
			System.out.println("Lista de cores adicionadas: ");
			System.out.println(cores);
			
			cores.sort (null);
			System.out.println("Lista de cores adicionadas em ordem crescente: ");
			System.out.println(cores);
			
		
			
		
	}

}
