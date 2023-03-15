package aula_01;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salariobruto, adicionalnoturno, horaextra, desconto;
		
		System.out.println("Insira seu salário bruto: ");
		salariobruto = leia.nextFloat();
		
		System.out.println("Insira seu Adicional Noturno: ");
		adicionalnoturno = leia.nextFloat();
		
		System.out.println("Insira suas horas extras: ");
		horaextra = leia.nextFloat();
		
		System.out.println("Insira os descontos: ");
		desconto = leia.nextFloat();
		
		System.out.println("Seu salário liquido é: " + (salariobruto+adicionalnoturno+(horaextra*5) - desconto));
		

	}

}
