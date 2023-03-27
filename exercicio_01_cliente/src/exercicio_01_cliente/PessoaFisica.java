package exercicio_01_cliente;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
	
	String rg;

	public PessoaFisica(String nome, LocalDate dataDeNascimento, int idade, String cpf, String email, String rg) {
		super(nome, dataDeNascimento, idade, cpf, email);
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
		
	public void visualizar() {
		super.visualizar();
		System.out.println("\nPessoa Fisica, R.G (com pontos e digito): " + this.rg);
		
	}
	
}
