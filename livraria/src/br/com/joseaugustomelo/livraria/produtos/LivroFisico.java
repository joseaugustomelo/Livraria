package br.com.joseaugustomelo.livraria.produtos;

import br.com.joseaugustomelo.livraria.Autor;

public class LivroFisico extends Livro  {

		public LivroFisico(Autor autor) {
			super(autor);
		}

		public double getTaxaImpressao() {
			return this.getValor() * 0.05;
		}
		
		public boolean aplicaDescontoDe(double porcentagem) {
			if (porcentagem > 0.3) {
				return false;
			}
			double desconto = getValor() * porcentagem;
			setValor(getValor() - desconto); 
			System.out.println("aplicando desconto no LivroFisico");
			return true;
		}
	}
	