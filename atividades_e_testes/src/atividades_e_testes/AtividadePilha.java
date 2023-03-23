package atividades_e_testes;

import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		

		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Brenda");
		pilha.push("Guilherme");
		pilha.push("Michelle");
		pilha.push("Gabriel Lopes");
		pilha.push("Katarina");
		
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Retirar elemento: ");
		pilha.pop();
		System.out.println(pilha);
		
		pilha.push("Reynaldo");
		System.out.println(pilha);
		
		System.out.println(pilha.size());
		
		System.out.println(pilha.contains("Reynaldo"));

	}

}
