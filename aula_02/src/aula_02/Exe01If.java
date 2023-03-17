package aula_02;

import java.util.Scanner;

public class Exe01If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Insira a variavel A: ");
		A=leia.nextInt();
		
		System.out.println("Insira a variavel B: ");
		B=leia.nextInt();
		
		System.out.println("Insira a variavel C: ");
		C=leia.nextInt();
		
		if ((A+B)>C) {
		System.out.println("A soma de A + B é maior que C");
		}
		else if ((A+B)<C) {
		System.out.println("A soma de A + B é menor que C");
		}
		else if ((A+B)==C){
		System.out.println("A soma de A + B é igual a C");
		}
		
	
		leia.close();
		
	

}}
