package aula_01;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario, abono, novosalario;
		
		System.out.println("Digite seu salário atual: ");
		salario = leia.nextFloat();
		System.out.println("Digite seu abono salárial: ");
		abono = leia.nextFloat();
		System.out.println("Este é seu novo salário: " + (salario+abono));
		
		
		
	}

}
