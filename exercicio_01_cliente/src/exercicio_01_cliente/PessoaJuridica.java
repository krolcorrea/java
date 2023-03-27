package exercicio_01_cliente;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
	
	String cnpj;
	

	public PessoaJuridica(String nome, LocalDate dataDeNascimento, int idade, String cpf, String email, String cnpj) {
		super(nome, dataDeNascimento, idade, cpf, email);
		this.cnpj = cnpj;
	}

	
	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	//dúvida: quando tenho mais de um atributo, tenho de adicionar um visualizar para cada atributo?
	public void visualizar() {
	super.visualizar();
	System.out.println("\nPessoa juridica, CNPJ: " + this.cnpj);
	}

}
