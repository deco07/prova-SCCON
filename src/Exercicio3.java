public class Exercicio3 {

	public static Double[][] processarArray(Double[][] matriz) {
		Double[][] response = new Double[matriz.length][matriz[1].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// Valor central
				if (i > 0 && i < matriz.length - 1 && j > 0 && j < matriz[i].length - 1) {
					Double vizinho = matriz[i - 1][j - 1] + matriz[i - 1][j] + matriz[i - 1][j + 1] + matriz[i][j - 1]
							+ matriz[i - 1][j + 1] + matriz[i + 1][j - 1] + matriz[i + 1][j] + matriz[i + 1][j + 1];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 9;
					continue;
					// Valor borda superior
				} else if (i == 0 && j < matriz[i].length - 1 && j > 0) {
					Double vizinho = matriz[i][j - 1] + matriz[i][j + 1] + matriz[i + 1][j - 1] + matriz[i + 1][j]
							+ matriz[i + 1][j + 1];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 6;
					continue;
					// Valor borda inferior
				} else if (i == matriz.length - 1 && j < matriz[i].length - 1 && j > 0) {
					Double vizinho = matriz[i][j - 1] + matriz[i][j + 1] + matriz[i - 1][j - 1] + matriz[i - 1][j]
							+ matriz[i - 1][j + 1];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 6;
					continue;
					// Valor borda direita
				} else if (i > 0 && i < matriz.length - 1 && j == matriz[i].length - 1) {
					Double vizinho = matriz[i - 1][j - 1] + matriz[i - 1][j] + matriz[i][j - 1] + matriz[i + 1][j - 1]
							+ matriz[i + 1][j];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 6;
					continue;
					// Valor borda esquerda
				} else if (i > 0 && i < matriz.length - 1 && j == 0) {
					Double vizinho = matriz[i - 1][j] + matriz[i - 1][j + 1] + matriz[i][j + 1] + matriz[i + 1][j]
							+ matriz[i + 1][j + 1];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 6;
					continue;
					// valor ponta esquerda superior
				} else if (i == 0 && j == 0) {
					Double vizinho = matriz[i][j + 1] + matriz[i + 1][j] + matriz[i + 1][j + 1];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 4;
					continue;
					// valor ponta direita superior
				} else if (i == 0 && j == matriz[i].length - 1) {
					Double vizinho = matriz[i][j - 1] + matriz[i + 1][j - 1] + matriz[i + 1][j];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 4;
					continue;
					// valor ponta esquerda inferior
				} else if (i == matriz.length - 1 && j == 0) {
					Double vizinho = matriz[i - 1][j] + matriz[i - 1][j + 1] + matriz[i][j + 1];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 4;
					continue;
					// valor ponta direita inferior
				} else if (i == matriz.length - 1 && j == matriz.length - 1) {
					Double vizinho = matriz[i - 1][j - 1] + matriz[i - 1][j] + matriz[i][j - 1];
					Double valor = matriz[i][j];
					response[i][j] = (valor + vizinho) / 4;
					continue;
				}
			}
		}
		return response;
	}
}
