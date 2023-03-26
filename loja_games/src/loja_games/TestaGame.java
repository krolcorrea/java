package loja_games;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {

		LocalDate data = LocalDate.of(2020, 9, 20);

		Produto g1 = new Produto(1, "Valorant", 1, "Riot Games", data, 1200.0f);

		g1.visualizar();

		LocalDate data2 = LocalDate.of(2021, 8, 21);
		g1.setDataLancamento(data2);
		g1.setVersao(2);

		g1.visualizar();

	}

}
