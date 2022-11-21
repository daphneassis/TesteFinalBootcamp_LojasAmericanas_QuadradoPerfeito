
public class PrimeiraPossibilidade {

	public static void main(String[] args) {
		int n = 3;
		int somaColuna = 0;
		int somaLinha = 0;
		int somaDiagonal1 = 0;
		int somaDiagonal2 = 0;

		int[][] matriz = montarEPreencheQuadradoPerfeito();

		for (int i = 0; i < n; i++) {
			somaDiagonal1 += matriz[i][i];
			somaDiagonal2 += matriz[i][n - 1 - i];
		}

		if (somaDiagonal1 != somaDiagonal2) {
			System.out.println("A soma das diagonais é diferente");
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				somaLinha += matriz[i][j];
				somaColuna += matriz[j][i];
			}
		}
			if (somaLinha != somaColuna || somaColuna != somaDiagonal1) {
				System.out.println("Não é um quadrado perfeito");
		} else {
			System.out.println("É um quadrado perfeito");
		}
		
		
}
	public static int[][] montarEPreencheQuadradoPerfeito() {
		int[][] matriz = { { 20, 6, 7, 17 }, { 9, 15, 14, 12 }, { 13, 11, 10, 16 }, { 8, 18, 19, 5 } };
		return matriz;
	}

}
