package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Exer02Pilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();

		String livro = null;
		int opcao;

		do {

			System.out.println("1 - Adicionar livro a pilha ");
			System.out.println("2 - Listar todos os livros ");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Adicionar livro a pilha ");
				System.out.println("Digite o nome do livro: ");

				leia.skip("\\R?");
				livros.push(leia.nextLine());
				
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Listar todos os livros");

				if (livros.isEmpty()) {
					System.out.println("Não existem livros cadastrados!");
				} else {
					for (var xLivros : livros)
						System.out.println(xLivros);
				}
				
				break;
			case 3:
				System.out.println("Retirar livro da pilha ");
				
				livros.pop();
				System.out.println("Um livro foi retirado! Livros disponiveis para retirada: " + livros);

				break;
			default:
				if (opcao > 3)
					System.out.println("Opção inválida!");

			}
		} while (opcao != 0);
		System.out.println("Programa Finalizado!");

		leia.close();

	}

}
