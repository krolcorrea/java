package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exer01Fila {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		Queue<String> clientes = new LinkedList<String>();

		
		int opcao;

		do {

			System.out.println("1 - Adicionar um novo cliente ");
			System.out.println("2 - Listar todos os clientes ");
			System.out.println("3 - Retirar Cliente da fila");
			System.out.println("0 - Sair");
			
			opcao = leia.nextInt();
			
			switch (opcao) {

			case 1:
				System.out.println("Adicionar um novo cliente");
				System.out.println("Digite o nome do novo cliente: ");
				leia.skip("\\R?");
                clientes.add(leia.nextLine());
				
                System.out.println("Cliente adicionado!");
			break;
			case 2:
				System.out.println("Listar todos os clientes");
				
				if (clientes.isEmpty()) {
					System.out.println("Não existem clientes cadastrades!");
				}else {
					for(var xClientes : clientes)
						System.out.println(xClientes);
				}
	
				break;
			case 3: 
				System.out.println("Retirar cliente da fila");
				
				clientes.poll();
				System.out.println("Um cliente foi chamado. Clientes ainda na fila: " + clientes);
				
				break;
			default:
				if(opcao > 3)
					System.out.println("Opção inválida!");	
				
			}
		} while (opcao != 0);
		System.out.println("Programa Finalizado!");
		
		leia.close();
		}
	
}