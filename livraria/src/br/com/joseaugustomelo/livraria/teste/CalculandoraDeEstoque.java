package br.com.joseaugustomelo.livraria.teste;

public class CalculandoraDeEstoque {

	public static void main(String[] args) {
		double soma = 0; 
		for (double i = 0; i < 35; i++) {
			soma += 59.90;
		}
		System.out.println("O total em estoque ? " + soma);

		if (soma < 150) {
			System.out.println("Seu estoque est? muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque est? muito alto!");
		} else {
			System.out.println("Seu estoque est? bom");
		}
	}
}
