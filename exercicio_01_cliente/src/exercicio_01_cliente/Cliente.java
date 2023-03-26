package exercicio_01_cliente;

public class Cliente {

	private String nome;
	private String dataDeNascimento;
	private int idade;
	private String cpf;
	private String email;
	
	public Cliente(String nome, String dataDeNascimento, int idade, String cpf, String email) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.idade = idade;
		this.cpf = cpf;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void visualizar() {
		
		System.out.println("******************************************************************************");
		System.out.println("Dados do Cliente: ");
		System.out.println("\n****************************************************************************");
		System.out.println("\nNome Cliente: " + this.nome);
		System.out.println("\nData de nascimento: " + this.dataDeNascimento);
		System.out.println("\nIdade: " + this.idade);
		System.out.println("\nNúmero CPF: " + this.cpf);
		System.out.println("\nEndereço de email: " + this.email);
	}
	
	
}
