package conta_bancaria.model;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}
	
	

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	//usado para comunicar que estou reescrevendo um metodo com o mesmo nome da SuperClasse
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo é insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo()  - valor);
		return true; 
	}
	@Override
	//usado para comunicar que estou reescrevendo um metodo com o mesmo nome da SuperClasse
	public void visualizar()
	{
		super.visualizar();
		System.out.println("Limite de crédito: " + this.limite);
	}
}
