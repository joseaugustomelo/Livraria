package br.com.joseaugustomelo.livraria.teste;

import br.com.joseaugustomelo.livraria.Autor;
import br.com.joseaugustomelo.livraria.produtos.Ebook;
import br.com.joseaugustomelo.livraria.produtos.LivroFisico;

public class RegraDeDesconto {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		LivroFisico livro = new LivroFisico(autor);
		livro.setValor(39.90);

		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no livro n�o pode ser maior do que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		if (!ebook.aplicaDescontoDe(0.03)) {
			System.out.println("Desconto no ebook n�o pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
	}
}