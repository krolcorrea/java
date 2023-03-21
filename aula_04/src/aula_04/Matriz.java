package aula_04;

public class Matriz {

	public static void main(String[] args) {

		int[][] matrizInteiros = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		float matrizFloat[][] = new float[2][3];

		for (int iLinha = 0; iLinha < matrizFloat.length; iLinha++)
			for (int iColuna = 0; iColuna < matrizFloat[iLinha].length; iColuna++)
				System.out.println(matrizFloat[iLinha][iColuna]);
	}

}
