package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("###,###,##0.00");
		Scanner leia = new Scanner (System.in);
		float nota1, nota2, nota3, nota4, media;
		
		
		System.out.println("Insira sua primeira nota: ");
		nota1 = leia.nextFloat ();
		
		System.out.println("Insira sua segunda nota: ");
		nota2 = leia.nextFloat ();
		
		System.out.println("Insira sua terceira nota: ");
		nota3 = leia.nextFloat ();
		
		System.out.println("Insira sua quarta nota: ");
		nota4 = leia.nextFloat ();
		
		System.out.println("Sua média final é: " + df.format((nota1+nota2+nota3+nota4)/4));
		
		

	}

}
