package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exe01Swicht {

	public static void main(String[] args) {

		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		Scanner leia = new Scanner(System.in);

		int n1 = 10, n2 = 15, n3 = 18, n4 = 12, n5 = 8, n6 = 13, quant, opcao;

		System.out.println("Produtos");
		System.out.println("1\tCachorro Quente\tR$ 10,00");
		System.out.println("2\tX-Salada\tR$ 15,00");
		System.out.println("3\tX-Bacon	\tR$ 18,00");
		System.out.println("4\tBauru	\tR$ 12,00");
		System.out.println("5\tRefrigerante\tR$ 8,00");
		System.out.println("6\tSuco de laranja\tR$ 13,00\n\n");

		System.out.println("Por favor digite o número do item que deseja");
		opcao = leia.nextInt();

		System.out.println("Por favor, digite a quantidade desejada");
		quant = leia.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Valor total do seu Cachorro Quente: " + nfMoeda.format(n1 * quant));
			break;
		case 2:
			System.out.println("Valor total do seu X-Salada: " + nfMoeda.format(n2 * quant));
			break;
		case 3:
			System.out.println("Valor total do seu X-Bacon: " + nfMoeda.format(n3 * quant));
			break;
		case 4:
			System.out.println("Valor total do seu Bauru: " + nfMoeda.format(n4 * quant));
			break;
		case 5:
			System.out.println("Valor total do seu Refrigerante: " + nfMoeda.format(n5 * quant));
			break;
		case 6:
			System.out.println("Valor total do seu Suco de Laranja: " + nfMoeda.format(n6 * quant));
			break;
		default:
			System.out.println("Por favor, digite um item válido");
		}

	}
}
