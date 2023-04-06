package conta_bancaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;

		ContaController contas = new ContaController();

		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 300000f, 20000.0f);
		contas.cadastrar(cc1);

		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Nilda Morel", 2500000f, 31200.0f);
		contas.cadastrar(cc2);

		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Carolina Correa", 10000f, 22);
		contas.cadastrar(cp1);

		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mayara Sandei", 13000f, 20);
		contas.cadastrar(cp2);

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
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
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

					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();

					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}
				keyPress();
			}

			case 2 -> {
				System.out.println("Listar todas as contas\n\n");
				contas.listarTodas();
				keyPress();
			}
			case 3 -> {
				System.out.println("Buscar conta por número\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				contas.procurarPorNumero(numero);

				keyPress();
			}
			case 4 -> {
				System.out.println("Atualizar dados da conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();

				if (contas.buscarNaCollection(numero) != null) {
					System.out.println("Digite o Numero da Agência: ");
					agencia = leia.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();

					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = leia.nextFloat();

					tipo = contas.retornaTipo(numero);

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Limite de Crédito (R$): ");
						limite = leia.nextFloat();

						contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = leia.nextInt();
						contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));

					}
					default -> {
						System.out.println("Tipo de conta inválido!");
					}
					}
					keyPress();
				}
			}
			case 5 -> {
				System.out.println("Apagar conta\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				contas.deletar(numero);

				keyPress();
			}
			case 6 -> {
				System.out.println("Sacar\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				do {
					System.out.println("Digite o valor do Saque: ");
					valor = leia.nextFloat();
				} while (valor <= 0);

				contas.sacar(numero, valor);

				keyPress();
			}
			case 7 -> {
				System.out.println("Depositar\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				do {
					System.out.println("Digite o valor do Depósito: ");
					valor = leia.nextFloat();
				} while (valor <= 0);

				contas.depositar(numero, valor);

				keyPress();
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

				contas.transferir(numero, numeroDestino, valor);

				keyPress();
			}
			default -> {
				System.out.println("\nOpção Inválida\n");
				keyPress();
			}

			}

		}
	}

	public static void sobre() {
		System.out.println("\nSistema de contas bancárias");
		System.out.println("\nCarolina Correa da Silva");
		System.out.println("Email: carolina.unila@gmail.com");
		System.out.println("GitHub:https://github.com/krolcorrea");

	}

	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione a tecla enter para continuar: ");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Erro de digitação!");
		}

	}
}
