package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		// teste da classe conta
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Adriana", 10000.0f, 1000.0f);
		cc1.visualizar();

		ContaCorrente cc2 = new ContaCorrente(1, 123, 1, "Gabriel", 100000.00f, 10000.00f);
		cc2.visualizar();

		cc2.sacar(100900);

		cc2.visualizar();

		cc2.depositar(2000);

		cc1.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(1, 124, 2, "Maria", 100000.00f,15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(3000.0f);
		cp1.visualizar();
		
		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		while (true) {

			System.out.println(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*********************************************************************");
			System.out.println("                                                                     ");
			System.out.println("                        BANCO DO BRAZIL COM Z                        ");
			System.out.println("                                                                     ");
			System.out.println("*********************************************************************");
			System.out.println("                                                                     ");
			System.out.println("                    1 - Criar Conta                                  ");
			System.out.println("                    2 - Listar todas as contas                       ");
			System.out.println("                    3 - Buscar conta por número                      ");
			System.out.println("                    4 - Atualizar dados da conta                     ");
			System.out.println("                    5 - Apagar conta                                 ");
			System.out.println("                    6 - Sacar                                        ");
			System.out.println("                    7 - Depositar                                    ");
			System.out.println("                    8 - Transferir valor entre Contas                ");
			System.out.println("                    9 - Sair                                         ");
			System.out.println("                                                                     ");
			System.out.println("*********************************************************************");
			System.out.println("Entre com a opção desejada:                                          ");
			System.out.println(
					"                                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				sobre();
				System.exit(0);
			}
			switch (opcao) {
			case 1 -> {
				System.out.println("Criar conta");
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca
				}
				}
			}

			case 2 -> {
				System.out.println("Listar todas as contas\n\n");
			}
			case 3 -> {
				System.out.println("Buscar conta por número\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 4 -> {
				System.out.println("Atualizar dados da conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				tipo = 1;
				// condicional buscar na collection

				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();

				// retornar tipo

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();

					// criar o objeto conta corrente
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					// criar o objeto conta poupanca

				}
				default -> {
					System.out.println("Tipo de conta inválido!");
				}
				}

				// fim do condicional buscar na collection
			}
			case 5 -> {
				System.out.println("Apagar conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
			}
			case 6 -> {
				System.out.println("Sacar\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				System.out.println("Digite o valor do Saque: ");
				valor = leia.nextFloat();
			}
			case 7 -> {
				System.out.println("Depositar\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				System.out.println("Digite o valor do Depósito: ");
				valor = leia.nextFloat();
			}

			case 8 -> {
				System.out.println("Transferir valor entre Contas\n\n");
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();

				do {
					System.out.println("Digite o Valor da Transferência (R$): ");
					valor = leia.nextFloat();
				} while (valor <= 0);

			}
			default -> System.out.println("\nOpção Inválida\n");
			}
			
			leia.close();
		}
	}

	public static void sobre() {
		System.out.println("\nSistema de contas bancárias");
		System.out.println("\nCarolina Correa da Silva");
		System.out.println("Email: carolina.unila@gmail.com");
		System.out.println("GitHub:https://github.com/krolcorrea");

	}

}
