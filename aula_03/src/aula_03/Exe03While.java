package aula_03;

import java.util.Scanner;

public class Exe03While {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int maior50 = 0, menor21 = 0, idade = 0;

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		if (idade < 0)
			System.out.println("Idade Inválida");

		while (idade > 50)
			System.out.println("Total de pessoas maiores que 50 anos: " + maior50);

		if (idade < 21 && idade > 0)
			menor21++;

		System.out.println("Total de pessoas menores que 21 anos: " + menor21);

	}
}
