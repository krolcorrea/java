package exercicio_01_cliente;

import java.time.LocalDate;

public class TesteCliente {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(1992, 02, 22);
		Cliente c1 = new Cliente ("Carolina", data, 31, "123.456.789.00", "carolina.unila@gmail.com" );
		
		c1.visualizar();
		
		LocalDate data1 = LocalDate.of(1992, 01, 20);
		Cliente c2 = new Cliente ("Mayara", data1, 31, "123.456.789.00", "may.unila@gmail.com" );
		
		c2.visualizar();
	
		LocalDate data2 = LocalDate.of(1992, 02, 22);
		PessoaFisica pf1 = new PessoaFisica ("Mayara", data2, 31, "123.456.789.00", "carolina.unila@gmail.com", "9.258.487.0" );
		pf1.visualizar();
		
		LocalDate data3 = LocalDate.of(1992, 02, 22);
		PessoaJuridica pj1 = new PessoaJuridica ("Mayara", data3, 31, "123.456.789.00", "carolina.unila@gmail.com", "9.258.487.000/1");
		pj1.visualizar();
	}

}
