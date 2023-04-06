package teste_devspizza.formapagamento;

import java.text.NumberFormat;
import java.util.Scanner;

public class TesteFormaPagamento {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		int pagamento = 0, preco = 15, formaDePagamento;

		boolean sair = true;
		char confirmarSair = 'S';
		String escolhaSair;

		do {
			System.out.println("\n••••••••••••••••• Forma de pagamento •••••••••••••••••\n");
			System.out.println("1 - Cartão de Crédito");
			System.out.println("2 - Cartão de Débito");
			System.out.println("3 - Pix");
			System.out.println("4 - Vale Refeição");
			System.out.println("5 - Dinheiro");
			System.out.println("0 - Sair");

			formaDePagamento = leia.nextInt();

			switch (formaDePagamento) {
			case 1 -> {
				System.out.println(nfMoeda.format(preco) + " pago no Cartão de Crédito, pressione 0 para sair");
				pagamento = leia.nextInt();

			}
			case 2 -> {
				System.out.println(nfMoeda.format(preco) + " pago no Cartão de Débito, pressione 0 para sair");
				pagamento = leia.nextInt();

			}
			case 3 -> {
				System.out.println(nfMoeda.format(preco) + " pago no Pix, pressione 0 para sair");
				pagamento = leia.nextInt();

			}
			case 4 -> {
				System.out.println(nfMoeda.format(preco) + " pago no Vale Refeição, pressione 0 para sair");
				pagamento = leia.nextInt();

			}
			case 5 -> {
				System.out.println(nfMoeda.format(preco) + " pago em Dinheiro, pressione 0 para sair");
				pagamento = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Sair");
				System.out.println("Deseja sair? [S/N]");
				escolhaSair = leia.next().toUpperCase();
				if (confirmarSair == 'S');{
				sair = true;
				}
				{ sair = false;
				}
			}
			default -> System.out.println("Opção inválida!");
			}
		}while (sair);

		
		

		leia.close();
	}

}
